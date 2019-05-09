package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.CoordinateBehavior;

public class CoordinateBean extends ParentBean implements CoordinateBehavior {

    protected double x;
    protected double y;
    protected double z;

    public CoordinateBean() {
    }

    public CoordinateBean(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public CoordinateBean(int id, double x, double y, double z) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "CoordinateBean{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CoordinateBean that = (CoordinateBean) o;

        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        return Double.compare(that.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double getX() {
        return x;
    }

    public CoordinateBean setX(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double getY() {
        return y;
    }

    public CoordinateBean setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public double getZ() {
        return z;
    }

    public CoordinateBean setZ(double z) {
        this.z = z;
        return this;
    }

    @Override
    public CoordinateBean setId(int id) {
        return (CoordinateBean) super.setId(id);
    }

    @Override
    public CoordinateBean setTag(Object tag) {
        return (CoordinateBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this.x);
        dest.writeDouble(this.y);
        dest.writeDouble(this.z);
    }

    protected CoordinateBean(Parcel in) {
        super(in);
        this.x = in.readDouble();
        this.y = in.readDouble();
        this.z = in.readDouble();
    }

    public static final Creator<CoordinateBean> CREATOR = new Creator<CoordinateBean>() {
        @Override
        public CoordinateBean createFromParcel(Parcel source) {
            return new CoordinateBean(source);
        }

        @Override
        public CoordinateBean[] newArray(int size) {
            return new CoordinateBean[size];
        }
    };

}
