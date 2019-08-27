package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.StateBehavior;


public class BaseStateBean extends BaseBean implements StateBehavior {

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

    @Override
    public String toString() {
        return "BaseStateBean{" +
                "state=" + state +
                ", stateDescriptor=" + stateDescriptor +
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
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public CharSequence getStateDescriptor() {
        return stateDescriptor;
    }

    @Override
    public void setStateDescriptor(CharSequence stateDescriptor) {
        this.stateDescriptor = stateDescriptor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.state);
        writeObject(dest,flags,stateDescriptor);
    }

    protected BaseStateBean(Parcel in) {
        super(in);
        this.state = in.readInt();
        this.stateDescriptor = (CharSequence) readObject(in);
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
