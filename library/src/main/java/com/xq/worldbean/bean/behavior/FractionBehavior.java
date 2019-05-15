package com.xq.worldbean.bean.behavior;


public interface FractionBehavior<T extends FractionBehavior> extends BaseBehavior<T> {

    public float getFraction();

    default float getFraction(String role) {
        return getFraction();
    }

    default T setFraction(float fraction){
        return (T)this;
    }

    default T setFraction(float fraction,String role){
        return setFraction(fraction);
    }

    //对当前百分比进度值的描述
    default CharSequence getFractionDescriptor(){
        return null;
    }

    default CharSequence getFractionDescriptor(String role){
        return getFractionDescriptor();
    }

    default T setFractionDescriptor(CharSequence descriptor){
        return (T)this;
    }

    default T setFractionDescriptor(CharSequence descriptor,String role){
        return setFractionDescriptor(descriptor);
    }

}
