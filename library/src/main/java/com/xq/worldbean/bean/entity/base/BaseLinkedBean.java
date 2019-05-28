package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.LinkedBehavior;

public class BaseLinkedBean<T extends BaseLinkedBean> extends BaseBean<T> implements LinkedBehavior<T> {

    protected String linked;

    public BaseLinkedBean() {
    }

    public BaseLinkedBean(String linked) {
        this.linked = linked;
    }

    @Override
    public String toString() {
        return "BaseLinkedBean{" +
                "linked='" + linked + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseLinkedBean that = (BaseLinkedBean) o;

        return linked != null ? linked.equals(that.linked) : that.linked == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (linked != null ? linked.hashCode() : 0);
        return result;
    }

    @Override
    public String getLinked() {
        return linked;
    }

    @Override
    public T setLinked(String linked) {
        this.linked = linked;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.linked);
    }

    protected BaseLinkedBean(Parcel in) {
        super(in);
        this.linked = in.readString();
    }

    public static final Creator<BaseLinkedBean> CREATOR = new Creator<BaseLinkedBean>() {
        @Override
        public BaseLinkedBean createFromParcel(Parcel source) {
            return new BaseLinkedBean(source);
        }

        @Override
        public BaseLinkedBean[] newArray(int size) {
            return new BaseLinkedBean[size];
        }
    };
}
