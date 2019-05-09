package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.ParentBehavior;

import java.io.Serializable;

public class BaseParentBean<T extends BaseParentBean> implements ParentBehavior {

    protected Object tag;
    protected int id;

    public BaseParentBean() {
    }

    public BaseParentBean(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseParentBean{" +
                "tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseParentBean that = (BaseParentBean) o;

        if (id != that.id) return false;
        return tag != null ? tag.equals(that.tag) : that.tag == null;
    }

    @Override
    public int hashCode() {
        int result = tag != null ? tag.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }

    @Override
    public Object getTag() {
        return tag;
    }

    public T setTag(Object tag) {
        this.tag = tag;
        return (T) this;
    }

    @Override
    public int getId() {
        return id;
    }

    public T setId(int id) {
        this.id = id;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (tag instanceof Parcelable)
            dest.writeParcelable((Parcelable) tag, flags);
        else    if (tag instanceof Serializable)
            dest.writeSerializable((Serializable) tag);
        dest.writeInt(id);
    }

    protected BaseParentBean(Parcel in) {
        if (tag instanceof Parcelable)
            this.tag = in.readParcelable(Object.class.getClassLoader());
        else    if (tag instanceof Serializable)
            this.tag = in.readSerializable();
        this.id = in.readInt();
    }

    public static final Parcelable.Creator<BaseParentBean> CREATOR = new Parcelable.Creator<BaseParentBean>() {
        @Override
        public BaseParentBean createFromParcel(Parcel in) {
            return new BaseParentBean(in);
        }

        @Override
        public BaseParentBean[] newArray(int size) {
            return new BaseParentBean[size];
        }
    };

}
