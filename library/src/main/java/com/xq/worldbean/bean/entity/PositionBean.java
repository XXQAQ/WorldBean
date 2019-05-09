package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.PositionBehavior;

public class PositionBean extends ParentBean implements PositionBehavior {

    private int position;
    private String positionRole;

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
                ", positionRole='" + positionRole + '\'' +
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

        PositionBean that = (PositionBean) o;

        if (position != that.position) return false;
        return positionRole != null ? positionRole.equals(that.positionRole) : that.positionRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + position;
        result = 31 * result + (positionRole != null ? positionRole.hashCode() : 0);
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
    public String getPositionRole() {
        return positionRole;
    }

    public PositionBean setPositionRole(String positionRole) {
        this.positionRole = positionRole;
        return this;
    }

    @Override
    public PositionBean setId(int id) {
        return (PositionBean) super.setId(id);
    }

    @Override
    public PositionBean setIdRole(String idRole) {
        return (PositionBean) super.setIdRole(idRole);
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
        dest.writeString(this.positionRole);
    }

    protected PositionBean(Parcel in) {
        super(in);
        this.position = in.readInt();
        this.positionRole = in.readString();
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
