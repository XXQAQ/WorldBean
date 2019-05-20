package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.BaseBehavior;

import java.io.Serializable;

public class BaseBean<T extends BaseBean> implements BaseBehavior<T>,Parcelable {

    protected Object tag;
    protected int id;
    protected int primaryId;

    public BaseBean() {
    }

    public BaseBean(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "tag=" + tag +
                ", id=" + id +
                ", primaryId=" + primaryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseBean that = (BaseBean) o;

        if (id != that.id) return false;
        if (primaryId != that.primaryId) return false;
        return tag != null ? tag.equals(that.tag) : that.tag == null;
    }

    @Override
    public int hashCode() {
        int result = tag != null ? tag.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + primaryId;
        return result;
    }

    @Override
    public Object getTag() {
        return tag;
    }

    @Override
    public T setTag(Object tag) {
        this.tag = tag;
        return (T) this;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public T setId(int id) {
        this.id = id;
        return (T) this;
    }

    @Override
    public int getPrimaryId() {
        return primaryId;
    }

    @Override
    public T setPrimaryId(int primaryId) {
        this.primaryId = primaryId;
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
        dest.writeInt(primaryId);
    }

    protected BaseBean(Parcel in) {
        if (tag instanceof Parcelable)
            this.tag = in.readParcelable(Object.class.getClassLoader());
        else    if (tag instanceof Serializable)
            this.tag = in.readSerializable();
        this.id = in.readInt();
        this.primaryId = in.readInt();
    }

    public static final Parcelable.Creator<BaseBean> CREATOR = new Parcelable.Creator<BaseBean>() {
        @Override
        public BaseBean createFromParcel(Parcel in) {
            return new BaseBean(in);
        }

        @Override
        public BaseBean[] newArray(int size) {
            return new BaseBean[size];
        }
    };

}
