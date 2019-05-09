package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.LenthBehavior;

public class BaseLenthBean<T extends BaseLenthBean> extends BaseParentBean implements LenthBehavior {

    protected int lenth;

    public BaseLenthBean() {
    }

    public BaseLenthBean(int lenth) {
        this.lenth = lenth;
    }

    public BaseLenthBean(int id, int lenth) {
        super(id);
        this.lenth = lenth;
    }

    @Override
    public String toString() {
        return "BaseLenthBean{" +
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

        BaseLenthBean lenthBean = (BaseLenthBean) o;

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

    public T setLenth(int lenth) {
        this.lenth = lenth;
        return (T) this;
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

    protected BaseLenthBean(Parcel in) {
        super(in);
        this.lenth = in.readInt();
    }

    public static final Creator<BaseLenthBean> CREATOR = new Creator<BaseLenthBean>() {
        @Override
        public BaseLenthBean createFromParcel(Parcel source) {
            return new BaseLenthBean(source);
        }

        @Override
        public BaseLenthBean[] newArray(int size) {
            return new BaseLenthBean[size];
        }
    };
}
