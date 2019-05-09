package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseProgressBean;

public class ProgressBean extends BaseProgressBean<ProgressBean> {
    public ProgressBean() {
    }

    public ProgressBean(float progress) {
        super(progress);
    }

    public ProgressBean(float progress, CharSequence progressDescript) {
        super(progress, progressDescript);
    }

    public ProgressBean(int id, float progress) {
        super(id, progress);
    }

    public ProgressBean(int id, float progress, CharSequence progressDescript) {
        super(id, progress, progressDescript);
    }
}
