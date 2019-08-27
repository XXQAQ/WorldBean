package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseTypeBean;

public class TypeBean extends BaseTypeBean {
    public TypeBean() {
    }

    public TypeBean(int type) {
        super(type);
    }

    public TypeBean(int type, CharSequence typeDescriptor) {
        super(type, typeDescriptor);
    }

    public TypeBean(String id, int type) {
        super(id, type);
    }

    public TypeBean(String id, int type, CharSequence typeDescriptor) {
        super(id, type, typeDescriptor);
    }
}
