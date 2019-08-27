package com.xq.worldbean.bean.behavior;

public interface LinkBehavior extends BaseBehavior{

    public String getLink();

    default String getLink(String role) {
        return getLink();
    }

    default void setLink(String link) {
    }

    default void setLink(String link, String role) {
        setLink(link);
    }

}
