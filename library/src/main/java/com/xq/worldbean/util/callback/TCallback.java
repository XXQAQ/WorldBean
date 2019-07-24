package com.xq.worldbean.util.callback;

public interface TCallback<T> extends UniverseCallback{

    public void onCallback(T t);

    @Deprecated
    @Override
    default void onCallback(Object... objects) {
        if (objects != null && objects.length >= 1) onCallback((T)objects[0]);
    }

}
