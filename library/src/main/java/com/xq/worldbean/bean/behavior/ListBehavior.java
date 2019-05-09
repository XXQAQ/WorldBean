package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

import java.util.List;

public interface ListBehavior<T> extends ParentBehavior , LenthBehavior{

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

    public List<T> getList();

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getListRole(){
        return null;
    }

}
