package com.xq.worldbean.bean.behavior;

public interface TagBehavior {

    public Object getTag();

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getTagRole(){
        return null;
    }
}
