package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ContentBehavior<T extends ContentBehavior> extends BaseBehavior<T> {

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

    default T setContent(CharSequence content){
        return (T)this;
    }

    default T setContent(CharSequence content,String role){
        return setContent(content);
    }

}
