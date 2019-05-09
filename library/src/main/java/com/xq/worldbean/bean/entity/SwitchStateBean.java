package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.behavior.SwitchStateBehavior;

public class SwitchStateBean extends StateBean implements SwitchStateBehavior {

    public SwitchStateBean() {
    }

    public SwitchStateBean(int state) {
        super(state);
    }

    public SwitchStateBean(int state, CharSequence stateDescript) {
        super(state, stateDescript);
    }

    public SwitchStateBean(int id, int state) {
        super(id, state);
    }

    public SwitchStateBean(int id, int state, CharSequence stateDescript) {
        super(id, state, stateDescript);
    }

    @Override
    public boolean isOn() {
        return SwitchStateBehavior.super.isOn();
    }

    public SwitchStateBean setOn(boolean isOn){
        return setState(isOn?1:0);
    }

    @Override
    public SwitchStateBean setState(int state) {
        return (SwitchStateBean) super.setState(state);
    }

    @Override
    public SwitchStateBean setStateDescript(CharSequence stateDescript) {
        return (SwitchStateBean) super.setStateDescript(stateDescript);
    }

    @Override
    public SwitchStateBean setStateRole(String stateRole) {
        return (SwitchStateBean) super.setStateRole(stateRole);
    }

    @Override
    public SwitchStateBean setId(int id) {
        return (SwitchStateBean) super.setId(id);
    }

    @Override
    public SwitchStateBean setIdRole(String idRole) {
        return (SwitchStateBean) super.setIdRole(idRole);
    }

    @Override
    public SwitchStateBean setTag(Object tag) {
        return (SwitchStateBean) super.setTag(tag);
    }

}
