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
    default CharSequence getLevelDescript() {
        return null;
    }

    default CharSequence getLevelDescript(String role) {
        return getLevelDescript();
    }

    default T setLevelDescript(CharSequence descript){
        return (T) this;
    }

    default T setLevelDescript(CharSequence descript,String role){
        return setLevelDescript(descript);
    }

}
