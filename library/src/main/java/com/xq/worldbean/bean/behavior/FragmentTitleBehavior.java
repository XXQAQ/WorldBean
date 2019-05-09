package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.support.v4.app.Fragment;

public interface FragmentTitleBehavior extends TitleBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public Fragment getFragment();

}
