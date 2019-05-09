package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.LenthBehavior;

public class LenthBean extends ParentBean implements LenthBehavior {

    protected int lenth;

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
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LenthBean lenthBean = (LenthBean) o;

        return lenth == lenthBean.lenth;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + lenth;
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
    public LenthBean setId(int id) {
        return (LenthBean) super.setId(id);
    }

    @Override
    public LenthBean setTag(Object tag) {
        return (LenthBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.lenth);
    }

    protected LenthBean(Parcel in) {
        super(in);
        this.lenth = in.readInt();
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
