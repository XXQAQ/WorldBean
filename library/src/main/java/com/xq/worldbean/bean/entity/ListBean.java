package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseListBean;

import java.util.List;

public class ListBean extends BaseListBean {
    public ListBean() {
    }

    public ListBean(List list) {
        super(list);
    }

    public ListBean(String id, List list) {
        super(id, list);
    }
}
