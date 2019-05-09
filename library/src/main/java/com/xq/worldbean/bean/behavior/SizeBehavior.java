package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface SizeBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public double getWidth();

    default double getWidth(String role) {
        return getWidth();
    }

    public double getHeight();

    default double getHeight(String role) {
        return getHeight();
    }

}
