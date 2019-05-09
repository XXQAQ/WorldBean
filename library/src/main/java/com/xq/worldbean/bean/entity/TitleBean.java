package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseTitleBean;

public class TitleBean extends BaseTitleBean<TitleBean> {
    public TitleBean() {
    }

    public TitleBean(CharSequence title) {
        super(title);
    }

    public TitleBean(int id, CharSequence title) {
        super(id, title);
    }
}
