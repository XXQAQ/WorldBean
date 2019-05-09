package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ContentBehavior extends BaseBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public CharSequence getContent();

    default CharSequence getContent(String role){
        return getContent();
    }

}
