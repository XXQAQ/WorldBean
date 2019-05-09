package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseNumberBean;

public class NumberBean extends BaseNumberBean<NumberBean> {
    public NumberBean() {
    }

    public NumberBean(Number number) {
        super(number);
    }

    public NumberBean(int id, Number number) {
        super(id, number);
    }
}
