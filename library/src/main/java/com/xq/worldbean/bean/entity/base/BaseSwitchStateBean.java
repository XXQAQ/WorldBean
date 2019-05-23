package com.xq.worldbean.bean.entity.base;

import com.xq.worldbean.bean.behavior.SwitchStateBehavior;

public class BaseSwitchStateBean<T extends BaseSwitchStateBean> extends BaseStateBean<T> implements SwitchStateBehavior<T> {

    public BaseSwitchStateBean() {
    }

    public BaseSwitchStateBean(int state) {
        super(state);
    }

    public BaseSwitchStateBean(int state, CharSequence stateDescriptor) {
        super(state, stateDescriptor);
    }

    public BaseSwitchStateBean(boolean isOn) {
        super(isOn?1:0);
    }

    public BaseSwitchStateBean(boolean isOn, CharSequence stateDescriptor) {
        super(isOn?1:0, stateDescriptor);
    }

    @Override
    public boolean isOn() {
        return getState() > 0;
    }

    @Override
    public T setOn(boolean isOn){
        return (T) setState(isOn?1:0);
    }

}
