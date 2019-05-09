package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface SwitchStateBehavior extends StateBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default int getId() {
        return 0;
    }

    //默认 state>0 的情况下标识为on，如果判断逻辑不同或需要变量单独处理则请重写此方法
    default boolean isOn() {
        return getState() > 0;
    }

    //isOn与getOn本质上无任何区别，只是getOn针对一些利用反射对方法名解析的框架做了兼容处理
    default boolean getOn(){
        return isOn();
    }

}
