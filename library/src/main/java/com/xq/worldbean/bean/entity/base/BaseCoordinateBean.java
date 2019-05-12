package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.CoordinateBehavior;

public class BaseCoordinateBean<T extends BaseCoordinateBean> extends BaseBean<T> implements CoordinateBehavior<T> {

    protected double x;
    protected double y;
    protected double z;

    public BaseCoordinateBean() {
    }

    public BaseCoordinateBean(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BaseCoordinateBean(int id, double x, double y, double z) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "BaseCoordinateBean{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
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

        BaseCoordinateBean that = (BaseCoordinateBean) o;

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

    @Override
    public T setX(double x) {
        this.x = x;
        return (T) this;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public T setY(double y) {
        this.y = y;
        return (T) this;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public T setZ(double z) {
        this.z = z;
        return (T) this;
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

    protected BaseCoordinateBean(Parcel in) {
        super(in);
        this.x = in.readDouble();
        this.y = in.readDouble();
        this.z = in.readDouble();
    }

    public static final Creator<BaseCoordinateBean> CREATOR = new Creator<BaseCoordinateBean>() {
        @Override
        public BaseCoordinateBean createFromParcel(Parcel source) {
            return new BaseCoordinateBean(source);
        }

        @Override
        public BaseCoordinateBean[] newArray(int size) {
            return new BaseCoordinateBean[size];
        }
    };

}
