package com.xq.worldbean.bean.behavior;

import com.xq.worldbean.util.callback.TCallback;
import java.io.Serializable;

public interface SoulBehavior extends Serializable {

    public TCallback getCallback();

    default void setCallback(TCallback callback) {

    }

}
