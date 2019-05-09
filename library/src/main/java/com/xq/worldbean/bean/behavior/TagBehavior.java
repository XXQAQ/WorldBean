package com.xq.worldbean.bean.behavior;

public interface TagBehavior {

    public Object getTag();

    default Object getTag(String role) {
        return getTag();
    }

}
