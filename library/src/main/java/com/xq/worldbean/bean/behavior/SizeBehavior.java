package com.xq.worldbean.bean.behavior;


public interface SizeBehavior extends BaseBehavior{

    public double getWidth();

    default double getWidth(String role) {
        return getWidth();
    }

    default void setWidth(double width){
    }

    default void setWidth(double width,String role){
        setWidth(width);
    }

    public double getHeight();

    default double getHeight(String role) {
        return getHeight();
    }

    default void setHeight(double height){
    }

    default void setHeight(double height,String role){
        setHeight(height);
    }

    public double getSize();

    default double getSize(String role) {
        return getSize();
    }

    default void setSize(double size) {
    }

    default void setSize(double size, String role) {
        setSize(size);
    }

}
