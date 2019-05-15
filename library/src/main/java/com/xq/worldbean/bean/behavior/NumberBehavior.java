package com.xq.worldbean.bean.behavior;


public interface NumberBehavior<T extends NumberBehavior> extends BaseBehavior<T> {

    public Number getNumber();

    default Number getNumber(String role) {
        return getNumber();
    }

    default T setNumber(Number number){
        return (T)this;
    }

    default T setNumber(Number number,String role){
        return setNumber(number);
    }

}
