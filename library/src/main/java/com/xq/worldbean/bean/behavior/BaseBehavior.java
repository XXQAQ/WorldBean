package com.xq.worldbean.bean.behavior;

public interface BaseBehavior<T extends BaseBehavior> extends IdBehavior<T>,TagBehavior<T>{

    @Override
    default Object getTag() {
        return null;
    }

    @Override
    default int getId() {
        return 0;
    }

}
