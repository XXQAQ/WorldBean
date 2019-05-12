package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.PositionBehavior;

public class BasePositionBean<T extends BasePositionBean> extends BaseBean implements PositionBehavior {

    protected int position;

    public BasePositionBean() {
    }

    public BasePositionBean(int position) {
        this.position = position;
    }

    public BasePositionBean(int id, int position) {
        super(id);
        this.position = position;
    }

    @Override
    public String toString() {
        return "BasePositionBean{" +
                "position=" + position +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BasePositionBean that = (BasePositionBean) o;

        return position == that.position;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + position;
        return result;
    }

    @Override
    public int getPosition() {
        return position;
    }

    public T setPosition(int position) {
        this.position = position;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.position);
    }

    protected BasePositionBean(Parcel in) {
        super(in);
        this.position = in.readInt();
    }

    public static final Creator<BasePositionBean> CREATOR = new Creator<BasePositionBean>() {
        @Override
        public BasePositionBean createFromParcel(Parcel source) {
            return new BasePositionBean(source);
        }

        @Override
        public BasePositionBean[] newArray(int size) {
            return new BasePositionBean[size];
        }
    };
}
