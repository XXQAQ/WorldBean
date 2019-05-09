package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.xq.worldbean.bean.behavior.StateBehavior;

import java.io.Serializable;

public class StateBean extends ParentBean implements StateBehavior {

    protected int state;
    protected CharSequence stateDescript;
    protected String stateRole;

    public StateBean() {
    }

    public StateBean(int state) {
        this.state = state;
    }

    public StateBean(int state, CharSequence stateDescript) {
        this.state = state;
        this.stateDescript = stateDescript;
    }

    public StateBean(int id, int state) {
        super(id);
        this.state = state;
    }

    public StateBean(int id, int state, CharSequence stateDescript) {
        super(id);
        this.state = state;
        this.stateDescript = stateDescript;
    }

    @Override
    public String toString() {
        return "StateBean{" +
                "state=" + state +
                ", stateDescript=" + stateDescript +
                ", stateRole='" + stateRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                ", tagRole='" + tagRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        StateBean stateBean = (StateBean) o;

        if (state != stateBean.state) return false;
        if (stateDescript != null ? !stateDescript.equals(stateBean.stateDescript) : stateBean.stateDescript != null)
            return false;
        return stateRole != null ? stateRole.equals(stateBean.stateRole) : stateBean.stateRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + state;
        result = 31 * result + (stateDescript != null ? stateDescript.hashCode() : 0);
        result = 31 * result + (stateRole != null ? stateRole.hashCode() : 0);
        return result;
    }

    @Override
    public int getState() {
        return state;
    }

    public StateBean setState(int state) {
        this.state = state;
        return this;
    }

    @Override
    public CharSequence getStateDescript() {
        return stateDescript;
    }

    public StateBean setStateDescript(CharSequence stateDescript) {
        this.stateDescript = stateDescript;
        return this;
    }

    @Override
    public String getStateRole() {
        return stateRole;
    }

    public StateBean setStateRole(String stateRole) {
        this.stateRole = stateRole;
        return this;
    }

    @Override
    public StateBean setId(int id) {
        return (StateBean) super.setId(id);
    }

    @Override
    public StateBean setIdRole(String idRole) {
        return (StateBean) super.setIdRole(idRole);
    }

    @Override
    public StateBean setTag(Object tag) {
        return (StateBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.state);
        if (stateDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) stateDescript, flags);
        else    if (stateDescript instanceof Serializable)
            dest.writeSerializable((Serializable) stateDescript);
        else
            dest.writeString(stateDescript == null?null:stateDescript.toString());
        dest.writeString(this.stateRole);
    }

    protected StateBean(Parcel in) {
        super(in);
        this.state = in.readInt();
        if (stateDescript instanceof Parcelable)
            this.stateDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (stateDescript instanceof Serializable)
            this.stateDescript = (CharSequence) in.readSerializable();
        else
            this.stateDescript = in.readString();
        this.stateRole = in.readString();
    }

    public static final Creator<StateBean> CREATOR = new Creator<StateBean>() {
        @Override
        public StateBean createFromParcel(Parcel source) {
            return new StateBean(source);
        }

        @Override
        public StateBean[] newArray(int size) {
            return new StateBean[size];
        }
    };
}
