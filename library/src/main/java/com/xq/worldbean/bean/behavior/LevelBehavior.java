package com.xq.worldbean.bean.behavior;


public interface LevelBehavior extends BaseBehavior{

    public int getLevel();

    default int getLevel(String role) {
        return getLevel();
    }

    default void setLevel(int level){
    }

    default void setLevel(int level,String role){
        setLevel(level);
    }

    //对等级的描述
    default CharSequence getLevelDescriptor() {
        return null;
    }

    default CharSequence getLevelDescriptor(String role) {
        return getLevelDescriptor();
    }

    default void setLevelDescriptor(CharSequence descriptor){
    }

    default void setLevelDescriptor(CharSequence descriptor,String role){
        setLevelDescriptor(descriptor);
    }

}
