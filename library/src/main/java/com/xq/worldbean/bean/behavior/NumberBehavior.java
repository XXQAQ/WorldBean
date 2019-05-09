package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface NumberBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public Number getNumber();

    default Number getNumber(String role) {
        return getNumber();
    }

}
