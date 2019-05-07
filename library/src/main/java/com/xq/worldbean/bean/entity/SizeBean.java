package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.SizeBehavior;

public class SizeBean extends ParentBean implements SizeBehavior {

    protected double width;
    protected double height;
    protected String sizeRole;

    public SizeBean() {
    }

    public SizeBean(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public SizeBean(int id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "SizeBean{" +
                "width=" + width +
                ", height=" + height +
                ", sizeRole='" + sizeRole + '\'' +
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

        SizeBean sizeBean = (SizeBean) o;

        if (Double.compare(sizeBean.width, width) != 0) return false;
        if (Double.compare(sizeBean.height, height) != 0) return false;
        return sizeRole != null ? sizeRole.equals(sizeBean.sizeRole) : sizeBean.sizeRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (sizeRole != null ? sizeRole.hashCode() : 0);
        return result;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public SizeBean setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public SizeBean setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public String getSizeRole() {
        return sizeRole;
    }

    public SizeBean setSizeRole(String sizeRole) {
        this.sizeRole = sizeRole;
        return this;
    }

    @Override
    public SizeBean setId(int id) {
        super.setId(id);
        return this;
    }

    @Override
    public SizeBean setIdRole(String idRole) {
        super.setIdRole(idRole);
        return this;
    }

    @Override
    public SizeBean setTag(Object tag) {
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
        dest.writeDouble(this.width);
        dest.writeDouble(this.height);
        dest.writeString(this.sizeRole);
    }

    protected SizeBean(Parcel in) {
        super(in);
        this.width = in.readDouble();
        this.height = in.readDouble();
        this.sizeRole = in.readString();
    }

    public static final Creator<SizeBean> CREATOR = new Creator<SizeBean>() {
        @Override
        public SizeBean createFromParcel(Parcel source) {
            return new SizeBean(source);
        }

        @Override
        public SizeBean[] newArray(int size) {
            return new SizeBean[size];
        }
    };
}
