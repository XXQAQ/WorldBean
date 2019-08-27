package com.xq.worldbean.bean.entity.base;

import com.xq.worldbean.bean.behavior.SwitchStateBehavior;

public class BaseSwitchStateBean extends BaseStateBean implements SwitchStateBehavior {

    public BaseSwitchStateBean() {
    }

    public BaseSwitchStateBean(boolean isOn) {
        super(isOn?1:0);
    }

    public BaseSwitchStateBean(boolean isOn, CharSequence stateDescriptor) {
        super(isOn?1:0, stateDescriptor);
    }

    public BaseSwitchStateBean(String id, boolean isOn) {
        super(id, isOn?1:0);
    }

    public BaseSwitchStateBean(String id, boolean isOn, CharSequence stateDescriptor) {
        super(id, isOn?1:0, stateDescriptor);
    }
}
