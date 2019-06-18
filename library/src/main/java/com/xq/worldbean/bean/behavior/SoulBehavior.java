package com.xq.worldbean.bean.behavior;

import com.xq.worldbean.util.callback.TCallback;

import java.io.Serializable;

public interface SoulBehavior<T> extends Serializable {

    default TCallback<T> getCallback(){
        return null;
    }

    default T setCallback(TCallback<T> callback) {
        return (T) this;
    }

}
