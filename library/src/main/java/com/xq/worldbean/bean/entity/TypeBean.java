package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseTypeBean;

public class TypeBean extends BaseTypeBean<TypeBean> {
    public TypeBean() {
    }

    public TypeBean(int type) {
        super(type);
    }

    public TypeBean(int id, int type) {
        super(id, type);
    }
}
