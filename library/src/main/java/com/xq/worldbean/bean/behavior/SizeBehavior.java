package com.xq.worldbean.bean.behavior;


public interface SizeBehavior<T extends SizeBehavior> extends BaseBehavior<T> {

    public double getWidth();

    default double getWidth(String role) {
        return getWidth();
    }

    default T setWidth(double width){
        return (T)this;
    }

    default T setWidth(double width,String role){
        return setWidth(width);
    }

    public double getHeight();

    default double getHeight(String role) {
        return getHeight();
    }

    default T setHeight(double height){
        return (T)this;
    }

    default T setHeight(double height,String role){
        return setHeight(height);
    }

}
