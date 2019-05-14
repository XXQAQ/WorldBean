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
    default CharSequence getStateDescriptor(){
        return null;
    }

    default CharSequence getStateDescriptor(String role){
        return getStateDescriptor();
    }

    default T setStateDescriptor(CharSequence descriptor){
        return (T)this;
    }

    default T setStateDescriptor(CharSequence descriptor,String role){
        return setStateDescriptor(descriptor);
    }

}
