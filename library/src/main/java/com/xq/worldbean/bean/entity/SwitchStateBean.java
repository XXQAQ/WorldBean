package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseSwitchStateBean;

public class SwitchStateBean extends BaseSwitchStateBean<SwitchStateBean> {
    public SwitchStateBean() {
    }

    public SwitchStateBean(int state) {
        super(state);
    }

    public SwitchStateBean(int state, CharSequence stateDescriptor) {
        super(state, stateDescriptor);
    }

    public SwitchStateBean(int id, int state) {
        super(id, state);
    }

    public SwitchStateBean(int id, int state, CharSequence stateDescriptor) {
        super(id, state, stateDescriptor);
    }

    public SwitchStateBean(boolean isOn) {
        super(isOn);
    }

    public SwitchStateBean(boolean isOn, CharSequence stateDescriptor) {
        super(isOn, stateDescriptor);
    }

    public SwitchStateBean(int id, boolean isOn) {
        super(id, isOn);
    }

    public SwitchStateBean(int id, boolean isOn, CharSequence stateDescriptor) {
        super(id, isOn, stateDescriptor);
    }
}
