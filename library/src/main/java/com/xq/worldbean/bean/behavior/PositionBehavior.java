package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface PositionBehavior extends ParentBehavior{

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

    public int getPosition();

    default String getPositionRole(){
        return null;
    }

}
