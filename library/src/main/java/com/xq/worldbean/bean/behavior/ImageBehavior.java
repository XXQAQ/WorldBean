package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ImageBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getImageRes();

    default int getImageRes(String role) {
        return getImageRes();
    }

    public String getImageUrl();

    default String getImageUrl(String role) {
        return getImageUrl();
    }

}
