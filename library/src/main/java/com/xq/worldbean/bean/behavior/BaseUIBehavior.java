package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface BaseUIBehavior extends ImageBehavior,NumberContentTitleBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default int getId() {
        return 0;
    }

    @Override
    default Object getTag() {
        return null;
    }

}
