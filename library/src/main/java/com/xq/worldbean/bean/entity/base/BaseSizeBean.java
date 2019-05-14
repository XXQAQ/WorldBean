package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.SizeBehavior;

public class BaseSizeBean<T extends BaseSizeBean> extends BaseBean<T> implements SizeBehavior<T> {

    protected double width;
    protected double height;

    public BaseSizeBean() {
    }

    public BaseSizeBean(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public BaseSizeBean(int id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "BaseSizeBean{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseSizeBean that = (BaseSizeBean) o;

        if (Double.compare(that.width, width) != 0) return false;
        return Double.compare(that.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public T setWidth(double width) {
        this.width = width;
        return (T) this;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public T setHeight(double height) {
        this.height = height;
        return (T) this;
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
    }

    protected BaseSizeBean(Parcel in) {
        super(in);
        this.width = in.readDouble();
        this.height = in.readDouble();
    }

    public static final Creator<BaseSizeBean> CREATOR = new Creator<BaseSizeBean>() {
        @Override
        public BaseSizeBean createFromParcel(Parcel source) {
            return new BaseSizeBean(source);
        }

        @Override
        public BaseSizeBean[] newArray(int size) {
            return new BaseSizeBean[size];
        }
    };
}
