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

    //有些服务器的id字段是String类型，真心很奇葩，无力吐槽只能做个额外兼容，因为太折磨人所以我定义的bean不准备实现以下接口
    //如果你的服务器没有上述情况，那么请无视以下方法
    default String getStringId(){
        return null;
    }

    default String getStringId(String role){
        return getStringId();
    }

    default T setStringId(String id){
        return (T) this;
    }

    default T setStringId(String id,String role){
        return setStringId(id);
    }

    default String getStringPrimaryId(){
        return null;
    }

    default T setStringPrimaryId(int id){
        return (T) this;
    }

}
