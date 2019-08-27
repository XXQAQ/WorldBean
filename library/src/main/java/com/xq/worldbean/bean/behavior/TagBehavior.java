package com.xq.worldbean.bean.behavior;

import java.io.Serializable;

public interface TagBehavior extends Serializable {

    public Object getTag();

    default Object getTag(String role) {
        return getTag();
    }

    default void setTag(Object tag) {
    }

    default void setTag(Object tag,String role) {
        setTag(tag);
    }

}
