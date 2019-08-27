package com.xq.worldbean.bean.behavior;


public interface CoordinateBehavior extends BaseBehavior {

    public double getX();

    default double getX(String role) {
        return getX();
    }

    default void setX(double x){
    }

    default void setX(double x,String role){
        setX(x);
    }

    public double getY();

    default double getY(String role) {
        return getY();
    }

    default void setY(double y){
    }

    default void setY(double y,String role){
        setY(y);
    }

    public double getZ();

    default double getZ(String role) {
        return getZ();
    }

    default void setZ(double z){
    }

    default void setZ(double z,String role){
        setZ(z);
    }

}
