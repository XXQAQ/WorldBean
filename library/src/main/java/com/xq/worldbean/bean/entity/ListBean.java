package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseListBean;

import java.util.List;

public class ListBean<T> extends BaseListBean<ListBean,T> {
    public ListBean() {
    }

    public ListBean(List<T> list) {
        super(list);
    }

    public ListBean(int id, List<T> list) {
        super(id, list);
    }
}
