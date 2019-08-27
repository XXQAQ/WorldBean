package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseSwitchStateBean;

public class SwitchStateBean extends BaseSwitchStateBean {
    public SwitchStateBean() {
    }

    public SwitchStateBean(boolean isOn) {
        super(isOn);
    }

    public SwitchStateBean(boolean isOn, CharSequence stateDescriptor) {
        super(isOn, stateDescriptor);
    }

    public SwitchStateBean(String id, boolean isOn) {
        super(id, isOn);
    }

    public SwitchStateBean(String id, boolean isOn, CharSequence stateDescriptor) {
        super(id, isOn, stateDescriptor);
    }
}
