package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.ParentBehavior;

import java.io.Serializable;

public class ParentBean implements ParentBehavior {

    protected Object tag;
    protected int id;
    protected String idRole;

    public ParentBean() {
    }

    public ParentBean(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParentBean{" +
                "tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParentBean that = (ParentBean) o;

        if (id != that.id) return false;
        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;
        return idRole != null ? idRole.equals(that.idRole) : that.idRole == null;
    }

    @Override
    public int hashCode() {
        int result = tag != null ? tag.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (idRole != null ? idRole.hashCode() : 0);
        return result;
    }

    @Override
    public Object getTag() {
        return tag;
    }

    public ParentBean setTag(Object tag) {
        this.tag = tag;
        return this;
    }

    @Override
    public int getId() {
        return id;
    }

    public ParentBean setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String getIdRole() {
        return idRole;
    }

    public ParentBean setIdRole(String idRole) {
        this.idRole = idRole;
        return this;
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
        dest.writeString(idRole);
    }

    protected ParentBean(Parcel in) {
        if (tag instanceof Parcelable)
            this.tag = in.readParcelable(Object.class.getClassLoader());
        else    if (tag instanceof Serializable)
            this.tag = in.readSerializable();
        this.id = in.readInt();
        this.idRole = in.readString();
    }

    public static final Parcelable.Creator<ParentBean> CREATOR = new Parcelable.Creator<ParentBean>() {
        @Override
        public ParentBean createFromParcel(Parcel in) {
            return new ParentBean(in);
        }

        @Override
        public ParentBean[] newArray(int size) {
            return new ParentBean[size];
        }
    };

}
