package com.xq.worldbean.bean.behavior;

import com.xq.worldbean.util.callback.TCallback;

public interface BaseBehavior extends IdBehavior,TagBehavior,SoulBehavior{

    @Override
    default Object getTag() {
        return null;
    }

    @Override
    default String getId() {
        return null;
    }

    @Override
    default TCallback getCallback(){
        return null;
    }

}
