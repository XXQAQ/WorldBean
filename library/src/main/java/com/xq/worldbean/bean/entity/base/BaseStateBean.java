package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;

import com.xq.worldbean.bean.behavior.StateBehavior;

import java.io.Serializable;

public class BaseStateBean<T extends BaseStateBean> extends BaseBean<T> implements StateBehavior<T> {

    protected int state;
    protected CharSequence stateDescriptor;

    public BaseStateBean() {
    }

    public BaseStateBean(int state) {
        this.state = state;
    }

    public BaseStateBean(int state, CharSequence stateDescriptor) {
        this.state = state;
        this.stateDescriptor = stateDescriptor;
    }

    public BaseStateBean(int id, int state) {
        super(id);
        this.state = state;
    }

    public BaseStateBean(int id, int state, CharSequence stateDescriptor) {
        super(id);
        this.state = state;
        this.stateDescriptor = stateDescriptor;
    }

    @Override
    public String toString() {
        return "BaseStateBean{" +
                "state=" + state +
                ", stateDescriptor=" + stateDescriptor +
                ", tag=" + tag +
                ", id=" + id +
                ", primaryId=" + primaryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseStateBean that = (BaseStateBean) o;

        if (state != that.state) return false;
        return stateDescriptor != null ? stateDescriptor.equals(that.stateDescriptor) : that.stateDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + state;
        result = 31 * result + (stateDescriptor != null ? stateDescriptor.hashCode() : 0);
        return result;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public T setState(int state) {
        this.state = state;
        return (T) this;
    }

    @Override
    public CharSequence getStateDescriptor() {
        return stateDescriptor;
    }

    @Override
    public T setStateDescriptor(CharSequence stateDescriptor) {
        this.stateDescriptor = stateDescriptor;
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
        if (stateDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) stateDescriptor, flags);
        else    if (stateDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) stateDescriptor);
        else
            dest.writeString(stateDescriptor == null?null:stateDescriptor.toString());
    }

    protected BaseStateBean(Parcel in) {
        super(in);
        this.state = in.readInt();
        if (stateDescriptor instanceof Parcelable)
            this.stateDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (stateDescriptor instanceof Serializable)
            this.stateDescriptor = (CharSequence) in.readSerializable();
        else
            this.stateDescriptor = in.readString();
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
