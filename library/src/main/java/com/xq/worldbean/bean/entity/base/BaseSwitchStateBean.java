package com.xq.worldbean.bean.entity.base;

import com.xq.worldbean.bean.behavior.SwitchStateBehavior;

public class BaseSwitchStateBean<T extends BaseSwitchStateBean> extends BaseStateBean<T> implements SwitchStateBehavior<T> {

    public BaseSwitchStateBean() {
    }

    public BaseSwitchStateBean(int state) {
        super(state);
    }

    public BaseSwitchStateBean(int state, CharSequence stateDescript) {
        super(state, stateDescript);
    }

    public BaseSwitchStateBean(int id, int state) {
        super(id, state);
    }

    public BaseSwitchStateBean(int id, int state, CharSequence stateDescript) {
        super(id, state, stateDescript);
    }

    @Override
    public boolean isOn() {
        return SwitchStateBehavior.super.isOn();
    }

    @Override
    public T setOn(boolean isOn){
        return (T) setState(isOn?1:0);
    }

}
