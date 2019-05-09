package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public interface IdBehavior extends Serializable, Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getId();

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getIdRole(){
        return null;
    }

    //主键
    default int getPrimaryId(){
        return 0;
    }

}
