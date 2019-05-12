package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface StateBehavior<T extends StateBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getState();

    default int getState(String role) {
        return getState();
    }

    default T setState(int state){
        return (T)this;
    }

    default T setState(int state,String role){
        return setState(state);
    }

    //对状态的描述
    default CharSequence getStateDescript(){
        return null;
    }

    default CharSequence getStateDescript(String role){
        return getStateDescript();
    }

    default T setStateDescript(CharSequence descript){
        return (T)this;
    }

    default T setStateDescript(CharSequence descript,String role){
        return setStateDescript(descript);
    }

}
