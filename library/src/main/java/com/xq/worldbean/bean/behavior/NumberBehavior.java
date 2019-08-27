package com.xq.worldbean.bean.behavior;


public interface NumberBehavior extends BaseBehavior{

    public Number getNumber();

    default Number getNumber(String role) {
        return getNumber();
    }

    default void setNumber(Number number){
    }

    default void setNumber(Number number,String role){
        setNumber(number);
    }

}
