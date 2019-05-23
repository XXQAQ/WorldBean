package com.xq.worldbean.bean.behavior;

import java.io.Serializable;

public interface IdBehavior<T extends IdBehavior> extends Serializable{

    public String getId();

    default String getId(String role) {
        return getId();
    }

    default T setId(String id){
        return (T) this;
    }

    default T setId(String id,String role){
        return setId(id);
    }

    //外键Id
    default String getForeignId(){
        return null;
    }

    default T setForeignId(String id){
        return (T) this;
    }

}
