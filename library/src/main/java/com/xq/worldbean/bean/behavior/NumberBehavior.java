package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface NumberBehavior<T extends NumberBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public Number getNumber();

    default Number getNumber(String role) {
        return getNumber();
    }

    default T setNumber(Number number){
        return (T)this;
    }

    default T setNumber(Number number,String role){
        return setNumber(number);
    }

}
