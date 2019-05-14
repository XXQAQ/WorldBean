package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface CodeBehavior<T extends CodeBehavior> extends BaseBehavior<T> {

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

    default T setCode(int code){
        return (T)this;
    }

    default T setCode(int code,String role){
        return setCode(code);
    }

    //对Code的描述
    default CharSequence getCodeDescriptor(){
        return null;
    }

    default CharSequence getCodeDescriptor(String role){
        return getCodeDescriptor();
    }

    default T setCodeDescriptor(CharSequence descriptor){
        return (T)this;
    }

    default T setCodeDescriptor(CharSequence descriptor,String role){
        return setCodeDescriptor(descriptor);
    }
}
