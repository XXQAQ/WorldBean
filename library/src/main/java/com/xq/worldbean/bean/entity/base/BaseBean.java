package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.BaseBehavior;

import java.io.Serializable;

public class BaseBean<T extends BaseBean> implements BaseBehavior<T>,Parcelable {

    protected Object tag;
    protected String id;
    protected String foreignId;

    public BaseBean() {
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "tag=" + tag +
                ", id='" + id + '\'' +
                ", foreignId='" + foreignId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseBean that = (BaseBean) o;

        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return foreignId != null ? foreignId.equals(that.foreignId) : that.foreignId == null;
    }

    @Override
    public int hashCode() {
        int result = tag != null ? tag.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (foreignId != null ? foreignId.hashCode() : 0);
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
    public String getId() {
        return id;
    }

    @Override
    public T setId(String id) {
        this.id = id;
        return (T) this;
    }

    @Override
    public String getForeignId() {
        return foreignId;
    }

    @Override
    public T setForeignId(String foreignId) {
        this.foreignId = foreignId;
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
        dest.writeString(id);
        dest.writeString(foreignId);
    }

    protected BaseBean(Parcel in) {
        if (tag instanceof Parcelable)
            this.tag = in.readParcelable(tag.getClass().getClassLoader());
        else    if (tag instanceof Serializable)
            this.tag = in.readSerializable();
        this.id = in.readString();
        this.foreignId = in.readString();
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
