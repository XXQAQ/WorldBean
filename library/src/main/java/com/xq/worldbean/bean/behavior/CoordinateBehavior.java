package com.xq.worldbean.bean.behavior;


public interface CoordinateBehavior<T extends CoordinateBehavior> extends BaseBehavior<T> {

    public double getX();

    default double getX(String role) {
        return getX();
    }

    default T setX(double x){
        return (T)this;
    }

    default T setX(double x,String role){
        return setX(x);
    }

    public double getY();

    default double getY(String role) {
        return getY();
    }

    default T setY(double y){
        return (T)this;
    }

    default T setY(double y,String role){
        return setY(y);
    }

    public double getZ();

    default double getZ(String role) {
        return getZ();
    }

    default T setZ(double z){
        return (T)this;
    }

    default T setZ(double z,String role){
        return setZ(z);
    }

}
