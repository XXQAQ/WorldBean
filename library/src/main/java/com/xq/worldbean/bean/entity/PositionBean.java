package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.PositionBehavior;

public class PositionBean extends ParentBean implements PositionBehavior {

    private int position;

    public PositionBean() {
    }

    public PositionBean(int position) {
        this.position = position;
    }

    public PositionBean(int id, int position) {
        super(id);
        this.position = position;
    }

    @Override
    public String toString() {
        return "PositionBean{" +
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

        PositionBean that = (PositionBean) o;

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

    public PositionBean setPosition(int position) {
        this.position = position;
        return this;
    }

    @Override
    public PositionBean setId(int id) {
        return (PositionBean) super.setId(id);
    }

    @Override
    public PositionBean setTag(Object tag) {
        return (PositionBean) super.setTag(tag);
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

    protected PositionBean(Parcel in) {
        super(in);
        this.position = in.readInt();
    }

    public static final Creator<PositionBean> CREATOR = new Creator<PositionBean>() {
        @Override
        public PositionBean createFromParcel(Parcel source) {
            return new PositionBean(source);
        }

        @Override
        public PositionBean[] newArray(int size) {
            return new PositionBean[size];
        }
    };
}
