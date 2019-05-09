package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.NumberBehavior;

public class NumberBean extends ParentBean implements NumberBehavior {

    protected Number number;

    public NumberBean() {
    }

    public NumberBean(Number number) {
        this.number = number;
    }

    public NumberBean(int id, Number number) {
        super(id);
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberBean{" +
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

        NumberBean that = (NumberBean) o;

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

    public NumberBean setNumber(Number number) {
        this.number = number;
        return this;
    }

    @Override
    public NumberBean setId(int id) {
        return (NumberBean) super.setId(id);
    }

    @Override
    public NumberBean setTag(Object tag) {
        return (NumberBean) super.setTag(tag);
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

    protected NumberBean(Parcel in) {
        super(in);
        this.number = (Number) in.readSerializable();
    }

    public static final Creator<NumberBean> CREATOR = new Creator<NumberBean>() {
        @Override
        public NumberBean createFromParcel(Parcel source) {
            return new NumberBean(source);
        }

        @Override
        public NumberBean[] newArray(int size) {
            return new NumberBean[size];
        }
    };

}
