package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ListBehavior;
import java.io.Serializable;
import java.util.List;

public class BaseListBean<T extends BaseListBean,T_List> extends BaseParentBean<T> implements ListBehavior<T_List> {

    protected List<T_List> list;

    public BaseListBean(List<T_List> list) {
        this.list = list;
    }

    public BaseListBean(int id, List<T_List> list) {
        super(id);
        this.list = list;
    }

    @Override
    public String toString() {
        return "BaseListBean{" +
                "list=" + list +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseListBean listBean = (BaseListBean) o;

        return list != null ? list.equals(listBean.list) : listBean.list == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (list != null ? list.hashCode() : 0);
        return result;
    }

    @Override
    public List<T_List> getList() {
        return list;
    }

    public T setList(List<T_List> list) {
        this.list = list;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeSerializable((Serializable) this.list);
    }

    protected BaseListBean(Parcel in) {
        super(in);
        this.list = (List) in.readSerializable();
    }

    public static final Creator<BaseListBean> CREATOR = new Creator<BaseListBean>() {
        @Override
        public BaseListBean createFromParcel(Parcel source) {
            return new BaseListBean(source);
        }

        @Override
        public BaseListBean[] newArray(int size) {
            return new BaseListBean[size];
        }
    };
}
