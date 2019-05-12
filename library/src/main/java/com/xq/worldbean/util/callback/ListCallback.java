package com.xq.worldbean.util.callback;

import com.xq.worldbean.bean.behavior.ListBehavior;

public interface ListCallback<T> {

    public void onCallback(ListBehavior<T> behavior);

}
