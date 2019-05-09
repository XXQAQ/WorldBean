package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface SuccessBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public boolean isSuccess();

    //getSuccess与isSuccess本质上无任何区别，只是getSuccess针对一些利用反射对方法名解析的框架做了兼容处理
    default boolean getSuccess(){
        return isSuccess();
    }

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getSuccessRole(){
        return null;
    }
}
