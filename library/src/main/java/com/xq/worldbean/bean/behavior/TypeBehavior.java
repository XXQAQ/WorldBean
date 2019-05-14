package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface TypeBehavior<T extends TypeBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getType();

    default int getType(String role) {
        return getType();
    }

    default T setType(int type){
        return (T)this;
    }

    default T setType(int type,String role){
        return setType(type);
    }

    //对类型的描述
    default CharSequence getTypeDescript(){
        return null;
    }

    default CharSequence getTypeDescript(String role){
        return getTypeDescript();
    }

    default T setTypeDescript(CharSequence descript){
        return (T)this;
    }

    default T setTypeDescript(CharSequence descript,String role){
        return setTypeDescript(descript);
    }

}
