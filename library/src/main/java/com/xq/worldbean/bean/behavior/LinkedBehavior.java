package com.xq.worldbean.bean.behavior;

public interface LinkedBehavior<T extends LinkedBehavior> extends BaseBehavior<T>{

    public String getLinked();

    default String getLinked(String role) {
        return getLinked();
    }

    default T setLinked(String linked) {
        return (T) this;
    }

    default T setLinked(String linked, String role) {
        return setLinked(linked);
    }

}
