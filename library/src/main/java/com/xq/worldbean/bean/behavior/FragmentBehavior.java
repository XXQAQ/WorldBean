package com.xq.worldbean.bean.behavior;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.lang.reflect.Constructor;

public interface FragmentBehavior<T extends FragmentBehavior> extends BaseBehavior<T>{

    default Fragment createFragment() {
        try {
            Constructor constructor = Class.forName(getFragmentName()).getDeclaredConstructor();
            constructor.setAccessible(true);
            Fragment fragment = (Fragment) constructor.newInstance();
            if (getFragmentArguments() != null) fragment.setArguments(getFragmentArguments());
            return fragment;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFragmentName();

    public Bundle getFragmentArguments();

    default T setFragmentName(String fragmentName){
        return (T)this;
    }

    default T setFragmentArguments(Bundle fragmentArguments){
        return (T) this;
    }

}
