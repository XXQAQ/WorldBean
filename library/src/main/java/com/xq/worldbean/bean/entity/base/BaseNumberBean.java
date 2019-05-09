package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.NumberBehavior;

public class BaseNumberBean<T extends BaseNumberBean> extends BaseBean implements NumberBehavior {

    protected Number number;

    public BaseNumberBean() {
    }

    public BaseNumberBean(Number number) {
        this.number = number;
    }

    public BaseNumberBean(int id, Number number) {
        super(id);
        this.number = number;
    }

    @Override
    public String toString() {
        return "BaseNumberBean{" +
                "number=" + number +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseNumberBean that = (BaseNumberBean) o;

        return number != null ? number.equals(that.number) : that.number == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public Number getNumber() {
        return number;
    }

    public T setNumber(Number number) {
        this.number = number;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeSerializable(this.number);
    }

    protected BaseNumberBean(Parcel in) {
        super(in);
        this.number = (Number) in.readSerializable();
    }

    public static final Creator<BaseNumberBean> CREATOR = new Creator<BaseNumberBean>() {
        @Override
        public BaseNumberBean createFromParcel(Parcel source) {
            return new BaseNumberBean(source);
        }

        @Override
        public BaseNumberBean[] newArray(int size) {
            return new BaseNumberBean[size];
        }
    };

}
