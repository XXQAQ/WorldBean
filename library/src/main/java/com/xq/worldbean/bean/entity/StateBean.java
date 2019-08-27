package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseStateBean;

public class StateBean extends BaseStateBean {
    public StateBean() {
    }

    public StateBean(int state) {
        super(state);
    }

    public StateBean(int state, CharSequence stateDescriptor) {
        super(state, stateDescriptor);
    }
}
