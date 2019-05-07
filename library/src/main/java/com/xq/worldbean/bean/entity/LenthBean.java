package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.LenthBehavior;

public class LenthBean extends ParentBean implements LenthBehavior {

    protected int lenth;
    protected String lenthRole;

    public LenthBean() {
    }

    public LenthBean(int lenth) {
        this.lenth = lenth;
    }

    public LenthBean(int id, int lenth) {
        super(id);
        this.lenth = lenth;
    }

    @Override
    public String toString() {
        return "LenthBean{" +
                "lenth=" + lenth +
                ", lenthRole='" + lenthRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LenthBean lenthBean = (LenthBean) o;

        if (lenth != lenthBean.lenth) return false;
        return lenthRole != null ? lenthRole.equals(lenthBean.lenthRole) : lenthBean.lenthRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + lenth;
        result = 31 * result + (lenthRole != null ? lenthRole.hashCode() : 0);
        return result;
    }

    @Override
    public int getLenth() {
        return lenth;
    }

    public LenthBean setLenth(int lenth) {
        this.lenth = lenth;
        return this;
    }

    @Override
    public String getLenthRole() {
        return lenthRole;
    }

    public LenthBean setLenthRole(String lenthRole) {
        this.lenthRole = lenthRole;
        return this;
    }

    @Override
    public LenthBean setId(int id) {
        super.setId(id);
        return this;
    }

    @Override
    public LenthBean setIdRole(String idRole) {
        super.setIdRole(idRole);
        return this;
    }

    @Override
    public LenthBean setTag(Object tag) {
        super.setTag(tag);
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.lenth);
        dest.writeString(this.lenthRole);
    }

    protected LenthBean(Parcel in) {
        super(in);
        this.lenth = in.readInt();
        this.lenthRole = in.readString();
    }

    public static final Creator<LenthBean> CREATOR = new Creator<LenthBean>() {
        @Override
        public LenthBean createFromParcel(Parcel source) {
            return new LenthBean(source);
        }

        @Override
        public LenthBean[] newArray(int size) {
            return new LenthBean[size];
        }
    };
}
