package com.xq.worldbean.util.callback;

public abstract class TClassCallback<T> implements TCallback<T> {

    private Class dataClass;

    public TClassCallback(Class<T> dataClass) {
        this.dataClass = dataClass;
    }

    public Class<T> getDataClass() {
        return dataClass;
    }

}
