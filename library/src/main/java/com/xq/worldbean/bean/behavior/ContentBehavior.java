package com.xq.worldbean.bean.behavior;


public interface ContentBehavior<T extends ContentBehavior> extends BaseBehavior<T> {

    public CharSequence getContent();

    default CharSequence getContent(String role){
        return getContent();
    }

    default T setContent(CharSequence content){
        return (T)this;
    }

    default T setContent(CharSequence content,String role){
        return setContent(content);
    }

}
