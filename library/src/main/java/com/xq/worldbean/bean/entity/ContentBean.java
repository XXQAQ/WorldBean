package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseContentBean;

public class ContentBean extends BaseContentBean {
    public ContentBean() {
    }

    public ContentBean(CharSequence content) {
        super(content);
    }

    public ContentBean(String id, CharSequence content) {
        super(id, content);
    }
}
