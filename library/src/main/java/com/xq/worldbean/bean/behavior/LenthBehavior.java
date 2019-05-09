package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface LenthBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getLenth();

    default int getLenth(String role) {
        return getLenth();
    }

}
