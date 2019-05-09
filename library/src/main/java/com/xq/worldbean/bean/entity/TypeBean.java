package com.xq.worldbean.bean.entity;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.TypeBehavior;

public class TypeBean extends ParentBean implements TypeBehavior {

    protected int type;
    protected String typeRole;

    public TypeBean() {
    }

    public TypeBean(int type) {
        this.type = type;
    }

    public TypeBean(int id, int type) {
        super(id);
        this.type = type;
    }

    @Override
    public String toString() {
        return "TypeBean{" +
                "type=" + type +
                ", typeRole='" + typeRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TypeBean typeBean = (TypeBean) o;

        if (type != typeBean.type) return false;
        return typeRole != null ? typeRole.equals(typeBean.typeRole) : typeBean.typeRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type;
        result = 31 * result + (typeRole != null ? typeRole.hashCode() : 0);
        return result;
    }

    @Override
    public int getType() {
        return type;
    }

    public TypeBean setType(int type) {
        this.type = type;
        return this;
    }

    @Override
    public String getTypeRole() {
        return typeRole;
    }

    public TypeBean setTypeRole(String typeRole) {
        this.typeRole = typeRole;
        return this;
    }

    @Override
    public TypeBean setId(int id) {
        return (TypeBean) super.setId(id);
    }

    @Override
    public TypeBean setIdRole(String idRole) {
        return (TypeBean) super.setIdRole(idRole);
    }

    @Override
    public TypeBean setTag(Object tag) {
        return (TypeBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type);
        dest.writeString(this.typeRole);
    }

    protected TypeBean(Parcel in) {
        super(in);
        this.type = in.readInt();
        this.typeRole = in.readString();
    }

    public static final Creator<TypeBean> CREATOR = new Creator<TypeBean>() {
        @Override
        public TypeBean createFromParcel(Parcel source) {
            return new TypeBean(source);
        }

        @Override
        public TypeBean[] newArray(int size) {
            return new TypeBean[size];
        }
    };
}
