package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface SimpleUIBehavior extends ImageBehavior,TitleBehavior,ContentBehavior,NumberBehavior{

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

    @Override
    default Object getTag() {
        return null;
    }

}
