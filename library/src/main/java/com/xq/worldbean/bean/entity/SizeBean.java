package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseSizeBean;

public class SizeBean extends BaseSizeBean {
    public SizeBean() {
    }

    public SizeBean(double width, double height) {
        super(width, height);
    }

    public SizeBean(double size) {
        super(size);
    }

    public SizeBean(String id, double width, double height) {
        super(id, width, height);
    }

    public SizeBean(String id, double size) {
        super(id, size);
    }
}
