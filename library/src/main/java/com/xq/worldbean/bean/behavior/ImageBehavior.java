package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ImageBehavior<T extends ImageBehavior> extends BaseBehavior<T> {

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

    default T setImageRes(int imageRes){
        return (T)this;
    }

    default T setImageRes(int imageRes,String role){
        return setImageRes(imageRes);
    }

    public String getImageUrl();

    default String getImageUrl(String role) {
        return getImageUrl();
    }

    default T setImageUrl(String imageUrl){
        return (T)this;
    }

    default T setImageUrl(String imageUrl,String role){
        return setImageUrl(imageUrl);
    }

}
