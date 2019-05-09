package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

import java.util.List;

public interface ListBehavior<T> extends BaseBehavior, LenthBehavior{

    @Override
    default int describeContents(){
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default int getLenth() {
        if (getList() == null)  return 0;
        return getList().size();
    }

    @Override
    default int getLenth(String role) {
        if (getList(role) == null) return 0;
        return getList(role).size();
    }

    public List<T> getList();

    default List getList(String role) {
        return getList();
    }

}
