package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface FragmentTitleBehavior<T extends FragmentTitleBehavior> extends TitleBehavior<T>,FragmentBehavior<T>{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

}
