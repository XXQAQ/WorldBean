package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

import java.util.List;

public interface ListBehavior<T extends ListBehavior> extends BaseBehavior<T>{

    @Override
    default int describeContents(){
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public List getList();

    default List getList(String role) {
        return getList();
    }

    default T setList(List list){
        return (T)this;
    }

    default T setList(List list, String role){
        return setList(list);
    }

}
