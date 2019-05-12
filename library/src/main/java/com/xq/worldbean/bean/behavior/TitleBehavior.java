package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface TitleBehavior<T extends TitleBehavior> extends BaseBehavior<T> {

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

    default T setTitle(CharSequence title) {
        return (T) this;
    }

    default T setTitle(CharSequence title,String role) {
        return setTitle(title);
    }

}
