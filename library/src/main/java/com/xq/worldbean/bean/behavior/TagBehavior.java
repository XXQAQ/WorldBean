package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public interface TagBehavior<T extends TagBehavior> extends Serializable, Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public Object getTag();

    default Object getTag(String role) {
        return getTag();
    }

    default T setTag(Object tag) {
        return (T) this;
    }

    default T setTag(Object tag,String role) {
        return setTag(tag);
    }

}
