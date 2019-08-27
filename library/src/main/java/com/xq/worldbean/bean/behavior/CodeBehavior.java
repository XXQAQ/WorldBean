package com.xq.worldbean.bean.behavior;


public interface CodeBehavior extends BaseBehavior {

    public int getCode();

    default int getCode(String role) {
        return getCode();
    }

    default void setCode(int code){
    }

    default void setCode(int code,String role){
        setCode(code);
    }

    //对Code的描述
    default CharSequence getCodeDescriptor(){
        return null;
    }

    default CharSequence getCodeDescriptor(String role){
        return getCodeDescriptor();
    }

    default void setCodeDescriptor(CharSequence descriptor){
    }

    default void setCodeDescriptor(CharSequence descriptor,String role){
        setCodeDescriptor(descriptor);
    }
}
