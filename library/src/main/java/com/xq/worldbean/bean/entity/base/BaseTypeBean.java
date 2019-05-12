package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.TypeBehavior;

public class BaseTypeBean<T extends BaseTypeBean> extends BaseBean<T> implements TypeBehavior<T> {

    protected int type;

    public BaseTypeBean() {
    }

    public BaseTypeBean(int type) {
        this.type = type;
    }

    public BaseTypeBean(int id, int type) {
        super(id);
        this.type = type;
    }

    @Override
    public String toString() {
        return "BaseTypeBean{" +
                "type=" + type +
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

        BaseTypeBean that = (BaseTypeBean) o;

        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type;
        return result;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public T setType(int type) {
        this.type = type;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type);
    }

    protected BaseTypeBean(Parcel in) {
        super(in);
        this.type = in.readInt();
    }

    public static final Creator<BaseTypeBean> CREATOR = new Creator<BaseTypeBean>() {
        @Override
        public BaseTypeBean createFromParcel(Parcel source) {
            return new BaseTypeBean(source);
        }

        @Override
        public BaseTypeBean[] newArray(int size) {
            return new BaseTypeBean[size];
        }
    };
}
