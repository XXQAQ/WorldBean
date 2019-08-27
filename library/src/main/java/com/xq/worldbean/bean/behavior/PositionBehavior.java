package com.xq.worldbean.bean.behavior;


public interface PositionBehavior extends BaseBehavior{

    public int getPosition();

    default int getPosition(String role) {
        return getPosition();
    }

    default void setPosition(int position){
    }

    default void setPosition(int position,String role){
        setPosition(position);
    }

    default int getStartPosition() {
        return 0;
    }

    default int getStartPosition(String role) {
        return getStartPosition();
    }

    default void setStartPosition(int startPosition){
    }

    default void setStartPosition(int startPosition,String role){
        setStartPosition(startPosition);
    }

    default int getEndPosition() {
        return 0;
    }

    default int getEndPosition(String role) {
        return getEndPosition();
    }

    default void setEndPosition(int endPosition){
    }

    default void setEndPosition(int endPosition,String role){
        setEndPosition(endPosition);
    }

}
