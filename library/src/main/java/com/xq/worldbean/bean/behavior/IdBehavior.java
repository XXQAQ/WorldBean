package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public interface IdBehavior extends Serializable, Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getId();

    default int getId(String role) {
        return getId();
    }

    //主键
    default int getPrimaryId(){
        return 0;
    }

    default int getPrimaryId(String role){
        return getPrimaryId();
    }

}
