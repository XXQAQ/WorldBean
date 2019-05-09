package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface TypeBehavior extends ParentBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getType();

    default int getType(String role) {
        return getType();
    }

}
