package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface CoordinateBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public double getX();

    default double getX(String role) {
        return getX();
    }

    public double getY();

    default double getY(String role) {
        return getY();
    }

    public double getZ();

    default double getZ(String role) {
        return getZ();
    }

}
