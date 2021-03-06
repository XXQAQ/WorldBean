package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.SizeBehavior;

public class BaseSizeBean extends BaseBean implements SizeBehavior {

    protected double width;
    protected double height;

    protected double size;

    public BaseSizeBean() {
    }

    public BaseSizeBean(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public BaseSizeBean(double size) {
        this.size = size;
    }

    public BaseSizeBean(String id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    public BaseSizeBean(String id, double size) {
        super(id);
        this.size = size;
    }

    @Override
    public String toString() {
        return "BaseSizeBean{" +
                "width=" + width +
                ", height=" + height +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseSizeBean that = (BaseSizeBean) o;

        if (Double.compare(that.width, width) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.size, size) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
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
        dest.writeDouble(this.size);
    }

    protected BaseSizeBean(Parcel in) {
        super(in);
        this.width = in.readDouble();
        this.height = in.readDouble();
        this.size = in.readDouble();
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
