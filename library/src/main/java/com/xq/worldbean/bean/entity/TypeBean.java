package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseTypeBean;

public class TypeBean extends BaseTypeBean<TypeBean> {
    public TypeBean() {
    }

    public TypeBean(int type) {
        super(type);
    }

    public TypeBean(int type, CharSequence typeDescript) {
        super(type, typeDescript);
    }

    public TypeBean(int id, int type) {
        super(id, type);
    }

    public TypeBean(int id, int type, CharSequence typeDescript) {
        super(id, type, typeDescript);
    }
}
