package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.CodeBehavior;

public class BaseCodeBean<T extends BaseCodeBean> extends BaseBean<T> implements CodeBehavior<T> {

    protected int code;

    public BaseCodeBean() {
    }

    public BaseCodeBean(int code) {
        this.code = code;
    }

    public BaseCodeBean(int id, int code) {
        super(id);
        this.code = code;
    }

    @Override
    public String toString() {
        return "BaseCodeBean{" +
                "code=" + code +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseCodeBean<?> that = (BaseCodeBean<?>) o;

        return code == that.code;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + code;
        return result;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public T setCode(int code) {
        this.code = code;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.code);
    }

    protected BaseCodeBean(Parcel in) {
        super(in);
        this.code = in.readInt();
    }

    public static final Creator<BaseCodeBean> CREATOR = new Creator<BaseCodeBean>() {
        @Override
        public BaseCodeBean createFromParcel(Parcel source) {
            return new BaseCodeBean(source);
        }

        @Override
        public BaseCodeBean[] newArray(int size) {
            return new BaseCodeBean[size];
        }
    };
}


