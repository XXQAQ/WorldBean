package com.xq.worldbean.bean.behavior;


public interface TitleBehavior extends BaseBehavior{

    public CharSequence getTitle();

    default CharSequence getTitle(String role) {
        return getTitle();
    }

    default void setTitle(CharSequence title) {
    }

    default void setTitle(CharSequence title,String role) {
        setTitle(title);
    }

}
