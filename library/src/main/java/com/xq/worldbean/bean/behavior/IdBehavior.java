package com.xq.worldbean.bean.behavior;

import java.io.Serializable;

public interface IdBehavior extends Serializable {

    public String getId();

    default String getId(String role) {
        return getId();
    }

    default void setId(String id){
    }

    default void setId(String id,String role){
        setId(id);
    }

    //外键Id
    default String getForeignId(){
        return null;
    }

    default String getForeignId(String role){
        return getForeignId();
    }

    default void setForeignId(String id){
    }

    default void setForeignId(String id,String role){
        setForeignId(id);
    }

}
