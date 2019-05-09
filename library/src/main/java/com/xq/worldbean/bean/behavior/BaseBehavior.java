package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public interface BaseBehavior extends IdBehavior,TagBehavior,Serializable,Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default Object getTag() {
        return null;
    }

    @Override
    default int getId() {
        return 0;
    }

}
