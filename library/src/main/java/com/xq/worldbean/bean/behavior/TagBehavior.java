package com.xq.worldbean.bean.behavior;

import java.io.Serializable;

public interface TagBehavior<T extends TagBehavior> extends Serializable{

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
