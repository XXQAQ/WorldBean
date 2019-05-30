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

    default int getStartPosition() {
        return 0;
    }

    default int getStartPosition(String role) {
        return getStartPosition();
    }

    default T setStartPosition(int startPosition){
        return (T) this;
    }

    default T setStartPosition(int startPosition,String role){
        return setStartPosition(startPosition);
    }

    default int getEndPosition() {
        return 0;
    }

    default int getEndPosition(String role) {
        return getEndPosition();
    }

    default T setEndPosition(int endPosition){
        return (T) this;
    }

    default T setEndPosition(int endPosition,String role){
        return setEndPosition(endPosition);
    }

}
