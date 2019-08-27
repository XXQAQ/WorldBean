package com.xq.worldbean.bean.behavior;


public interface TypeBehavior extends BaseBehavior{

    public int getType();

    default int getType(String role) {
        return getType();
    }

    default void setType(int type){
    }

    default void setType(int type,String role){
        setType(type);
    }

    //对类型的描述
    default CharSequence getTypeDescriptor(){
        return null;
    }

    default CharSequence getTypeDescriptor(String role){
        return getTypeDescriptor();
    }

    default void setTypeDescriptor(CharSequence descriptor){
    }

    default void setTypeDescriptor(CharSequence descriptor,String role){
        setTypeDescriptor(descriptor);
    }

}
