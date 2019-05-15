package com.xq.worldbean.bean.behavior;


public interface TitleBehavior<T extends TitleBehavior> extends BaseBehavior<T> {

    public CharSequence getTitle();

    default CharSequence getTitle(String role) {
        return getTitle();
    }

    default T setTitle(CharSequence title) {
        return (T) this;
    }

    default T setTitle(CharSequence title,String role) {
        return setTitle(title);
    }

}
