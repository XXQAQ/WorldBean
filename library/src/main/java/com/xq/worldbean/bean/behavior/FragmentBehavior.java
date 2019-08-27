package com.xq.worldbean.bean.behavior;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.lang.reflect.Constructor;

public interface FragmentBehavior extends BaseBehavior{

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

    default void setFragmentName(String fragmentName){
    }

    default void setFragmentArguments(Bundle fragmentArguments){
    }

}
