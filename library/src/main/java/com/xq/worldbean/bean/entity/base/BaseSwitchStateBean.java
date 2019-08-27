package com.xq.worldbean.bean.entity.base;

import com.xq.worldbean.bean.behavior.SwitchStateBehavior;

public class BaseSwitchStateBean extends BaseStateBean implements SwitchStateBehavior {

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

}
