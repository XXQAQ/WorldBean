package com.xq.worldbean.bean.behavior;


public interface StateBehavior extends BaseBehavior{

    public int getState();

    default int getState(String role) {
        return getState();
    }

    default void setState(int state){
    }

    default void setState(int state,String role){
        setState(state);
    }

    //对状态的描述
    default CharSequence getStateDescriptor(){
        return null;
    }

    default CharSequence getStateDescriptor(String role){
        return getStateDescriptor();
    }

    default void setStateDescriptor(CharSequence descriptor){
    }

    default void setStateDescriptor(CharSequence descriptor,String role){
        setStateDescriptor(descriptor);
    }

}
