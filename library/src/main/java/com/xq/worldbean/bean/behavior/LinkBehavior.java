package com.xq.worldbean.bean.behavior;

public interface LinkBehavior<T extends LinkBehavior> extends BaseBehavior<T>{

    public String getLink();

    default String getLink(String role) {
        return getLink();
    }

    default T setLink(String link) {
        return (T) this;
    }

    default T setLink(String link, String role) {
        return setLink(link);
    }

}
