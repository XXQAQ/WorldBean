package com.xq.worldbean.bean.behavior;

import java.util.List;

public interface ListBehavior<T> extends BaseBehavior{

    public List<T> getList();

    default List getList(String role) {
        return getList();
    }

    default void setList(List<T> list){
    }

    default void setList(List list, String role){
        setList(list);
    }

}
