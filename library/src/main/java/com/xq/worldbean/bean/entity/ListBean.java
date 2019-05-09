package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ListBehavior;
import java.io.Serializable;
import java.util.List;

public class ListBean<T> extends ParentBean implements ListBehavior<T> {

    protected List<T> list;
    protected String listRole;

    public ListBean(List<T> list) {
        this.list = list;
    }

    public ListBean(int id, List<T> list) {
        super(id);
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListBean{" +
                "list=" + list +
                ", listRole='" + listRole + '\'' +
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

        ListBean<?> listBean = (ListBean<?>) o;

        if (list != null ? !list.equals(listBean.list) : listBean.list != null) return false;
        return listRole != null ? listRole.equals(listBean.listRole) : listBean.listRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (list != null ? list.hashCode() : 0);
        result = 31 * result + (listRole != null ? listRole.hashCode() : 0);
        return result;
    }

    @Override
    public List<T> getList() {
        return list;
    }

    public ListBean<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

    @Override
    public String getListRole() {
        return listRole;
    }

    public ListBean<T> setListRole(String listRole) {
        this.listRole = listRole;
        return this;
    }

    @Override
    public ListBean setId(int id) {
        return (ListBean) super.setId(id);
    }

    @Override
    public ListBean setIdRole(String idRole) {
        return (ListBean) super.setIdRole(idRole);
    }

    @Override
    public ListBean setTag(Object tag) {
        return (ListBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeSerializable((Serializable) this.list);
        dest.writeString(this.listRole);
    }

    protected ListBean(Parcel in) {
        super(in);
        this.list = (List<T>) in.readSerializable();
        this.listRole = in.readString();
    }

    public static final Creator<ListBean> CREATOR = new Creator<ListBean>() {
        @Override
        public ListBean createFromParcel(Parcel source) {
            return new ListBean(source);
        }

        @Override
        public ListBean[] newArray(int size) {
            return new ListBean[size];
        }
    };
}
