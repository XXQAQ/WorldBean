package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseStateBean;

public class StateBean extends BaseStateBean<StateBean> {
    public StateBean() {
    }

    public StateBean(int state) {
        super(state);
    }

    public StateBean(int state, CharSequence stateDescript) {
        super(state, stateDescript);
    }

    public StateBean(int id, int state) {
        super(id, state);
    }

    public StateBean(int id, int state, CharSequence stateDescript) {
        super(id, state, stateDescript);
    }
}
