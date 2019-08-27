package com.xq.worldbean.bean.behavior;


public interface SuccessBehavior extends BaseBehavior{

    public boolean isSuccess();

    default boolean isSuccess(String role) {
        return isSuccess();
    }

    //getSuccess与isSuccess本质上无任何区别，只是getSuccess针对一些利用反射对方法名解析的框架做了兼容处理
    default boolean getSuccess(){
        return isSuccess();
    }

    default boolean getSuccess(String role){
        return isSuccess(role);
    }

    default void setSuccess(boolean isSuccess){
    }

    default void setSuccess(boolean isSuccess,String role){
        setSuccess(isSuccess);
    }

}
