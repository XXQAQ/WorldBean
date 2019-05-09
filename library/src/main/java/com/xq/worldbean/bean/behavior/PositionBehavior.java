package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface PositionBehavior extends BaseBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getPosition();

    default int getPosition(String role) {
        return getPosition();
    }

}
