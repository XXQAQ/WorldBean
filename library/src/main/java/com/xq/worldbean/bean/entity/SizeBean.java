package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseSizeBean;

public class SizeBean extends BaseSizeBean<SizeBean> {
    public SizeBean() {
    }

    public SizeBean(double width, double height) {
        super(width, height);
    }

    public SizeBean(int id, double width, double height) {
        super(id, width, height);
    }
}
