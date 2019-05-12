package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public interface IdBehavior<T extends IdBehavior> extends Serializable, Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getId();

    default int getId(String role) {
        return getId();
    }

    default T setId(int id){
        return (T) this;
    }

    default T setId(int id,String role){
        return setId(id);
    }

    //主键
    default int getPrimaryId(){
        return 0;
    }

    default T setPrimaryId(int id){
        return (T) this;
    }

}
