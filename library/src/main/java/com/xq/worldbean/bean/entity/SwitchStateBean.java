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

    public SwitchStateBean(boolean isOn) {
        super(isOn);
    }

    public SwitchStateBean(boolean isOn, CharSequence stateDescriptor) {
        super(isOn, stateDescriptor);
    }
}
