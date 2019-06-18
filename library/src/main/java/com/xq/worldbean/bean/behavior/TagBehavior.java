package com.xq.worldbean.bean.behavior;

public interface TagBehavior<T extends TagBehavior> extends SoulBehavior<T>{

    public Object getTag();

    default Object getTag(String role) {
        return getTag();
    }

    default T setTag(Object tag) {
        return (T) this;
    }

    default T setTag(Object tag,String role) {
        return setTag(tag);
    }

}
