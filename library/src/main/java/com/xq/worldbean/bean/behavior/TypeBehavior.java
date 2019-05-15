package com.xq.worldbean.bean.behavior;


public interface TypeBehavior<T extends TypeBehavior> extends BaseBehavior<T> {

    public int getType();

    default int getType(String role) {
        return getType();
    }

    default T setType(int type){
        return (T)this;
    }

    default T setType(int type,String role){
        return setType(type);
    }

    //对类型的描述
    default CharSequence getTypeDescriptor(){
        return null;
    }

    default CharSequence getTypeDescriptor(String role){
        return getTypeDescriptor();
    }

    default T setTypeDescriptor(CharSequence descriptor){
        return (T)this;
    }

    default T setTypeDescriptor(CharSequence descriptor,String role){
        return setTypeDescriptor(descriptor);
    }

}
