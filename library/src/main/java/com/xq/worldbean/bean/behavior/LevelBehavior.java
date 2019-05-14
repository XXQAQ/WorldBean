package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface LevelBehavior<T extends LevelBehavior> extends BaseBehavior<T>{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getLevel();

    default int getLevel(String role) {
        return getLevel();
    }

    default T setLevel(int level){
        return (T) this;
    }

    default T setLevel(int level,String role){
        return setLevel(level);
    }

    //对等级的描述
    default CharSequence getLevelDescriptor() {
        return null;
    }

    default CharSequence getLevelDescriptor(String role) {
        return getLevelDescriptor();
    }

    default T setLevelDescriptor(CharSequence descriptor){
        return (T) this;
    }

    default T setLevelDescriptor(CharSequence descriptor,String role){
        return setLevelDescriptor(descriptor);
    }

}
