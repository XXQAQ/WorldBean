package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface CodeBehavior extends BaseBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getCode();

    default int getCode(String role) {
        return getCode();
    }

}
