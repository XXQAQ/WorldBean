package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface PositionBehavior<T extends PositionBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getPosition();

    default int getPosition(String role) {
        return getPosition();
    }

    default T setPosition(int position){
        return (T)this;
    }

    default T setPosition(int position,String role){
        return setPosition(position);
    }

}
