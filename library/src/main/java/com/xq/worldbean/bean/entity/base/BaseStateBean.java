package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;

import com.xq.worldbean.bean.behavior.StateBehavior;

import java.io.Serializable;

public class BaseStateBean<T extends BaseStateBean> extends BaseParentBean implements StateBehavior {

    protected int state;
    protected CharSequence stateDescript;

    public BaseStateBean() {
    }

    public BaseStateBean(int state) {
        this.state = state;
    }

    public BaseStateBean(int state, CharSequence stateDescript) {
        this.state = state;
        this.stateDescript = stateDescript;
    }

    public BaseStateBean(int id, int state) {
        super(id);
        this.state = state;
    }

    public BaseStateBean(int id, int state, CharSequence stateDescript) {
        super(id);
        this.state = state;
        this.stateDescript = stateDescript;
    }

    @Override
    public String toString() {
        return "BaseStateBean{" +
                "state=" + state +
                ", stateDescript=" + stateDescript +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseStateBean stateBean = (BaseStateBean) o;

        if (state != stateBean.state) return false;
        return stateDescript != null ? stateDescript.equals(stateBean.stateDescript) : stateBean.stateDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + state;
        result = 31 * result + (stateDescript != null ? stateDescript.hashCode() : 0);
        return result;
    }

    @Override
    public int getState() {
        return state;
    }

    public T setState(int state) {
        this.state = state;
        return (T) this;
    }

    @Override
    public CharSequence getStateDescript() {
        return stateDescript;
    }

    public T setStateDescript(CharSequence stateDescript) {
        this.stateDescript = stateDescript;
        return (T) this;
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
    }

    protected BaseStateBean(Parcel in) {
        super(in);
        this.state = in.readInt();
        if (stateDescript instanceof Parcelable)
            this.stateDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (stateDescript instanceof Serializable)
            this.stateDescript = (CharSequence) in.readSerializable();
        else
            this.stateDescript = in.readString();
    }

    public static final Creator<BaseStateBean> CREATOR = new Creator<BaseStateBean>() {
        @Override
        public BaseStateBean createFromParcel(Parcel source) {
            return new BaseStateBean(source);
        }

        @Override
        public BaseStateBean[] newArray(int size) {
            return new BaseStateBean[size];
        }
    };
}
