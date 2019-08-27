package com.xq.worldbean.bean.behavior;


public interface ContentBehavior extends BaseBehavior{

    public CharSequence getContent();

    default CharSequence getContent(String role){
        return getContent();
    }

    default void setContent(CharSequence content){
    }

    default void setContent(CharSequence content,String role){
        setContent(content);
    }

}
