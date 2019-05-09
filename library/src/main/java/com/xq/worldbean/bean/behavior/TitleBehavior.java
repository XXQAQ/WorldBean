package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface TitleBehavior extends BaseBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public CharSequence getTitle();

    default CharSequence getTitle(String role) {
        return getTitle();
    }

}
