package com.xq.worldbean.bean.behavior;


public interface SwitchStateBehavior extends StateBehavior{

    //默认 state>0 的情况下标识为on，如果判断逻辑不同或需要变量单独处理则请重写此方法
    default boolean isOn() {
        return getState() > 0;
    }

    default boolean isOn(String role) {
        return isOn();
    }

    //isOn与getOn本质上无任何区别，只是getOn针对一些利用反射对方法名解析的框架做了兼容处理
    default boolean getOn(){
        return isOn();
    }

    default boolean getOn(String role){
        return isOn(role);
    }

    default void setOn(boolean isOn){
        setState(isOn?1:0);
    }

    default void setOn(boolean isOn,String role){
        setOn(isOn);
    }

}
