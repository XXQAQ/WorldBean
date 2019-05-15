package com.xq.worldbean.bean.behavior;


public interface PositionBehavior<T extends PositionBehavior> extends BaseBehavior<T> {

    public int getPosition();

    default int getPosition(String role) {
        return getPosition();
    }

    default T setPosition(int position){
        return (T)this;
    }

    default T setPosition(int position,String role){
        return setPosition(position);
    }

}
