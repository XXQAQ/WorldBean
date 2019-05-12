package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface SuccessBehavior<T extends SuccessBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public boolean isSuccess();

    default boolean isSuccess(String role) {
        return isSuccess();
    }

    //getSuccess与isSuccess本质上无任何区别，只是getSuccess针对一些利用反射对方法名解析的框架做了兼容处理
    default boolean getSuccess(){
        return isSuccess();
    }

    default boolean getSuccess(String role){
        return isSuccess(role);
    }

    default T setSuccess(boolean isSuccess){
        return (T)this;
    }

    default T setSuccess(boolean isSuccess,String role){
        return setSuccess(isSuccess);
    }

}
