package com.xq.worldbean.bean.behavior;


public interface FractionBehavior extends BaseBehavior{

    public float getFraction();

    default float getFraction(String role) {
        return getFraction();
    }

    default void setFraction(float fraction){
    }

    default void setFraction(float fraction,String role){
        setFraction(fraction);
    }

    //对当前百分比进度值的描述
    default CharSequence getFractionDescriptor(){
        return null;
    }

    default CharSequence getFractionDescriptor(String role){
        return getFractionDescriptor();
    }

    default void setFractionDescriptor(CharSequence descriptor){
    }

    default void setFractionDescriptor(CharSequence descriptor,String role){
        setFractionDescriptor(descriptor);
    }

}
