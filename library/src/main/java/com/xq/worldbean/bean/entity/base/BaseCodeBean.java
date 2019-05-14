package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.CodeBehavior;
import java.io.Serializable;

public class BaseCodeBean<T extends BaseCodeBean> extends BaseBean<T> implements CodeBehavior<T> {

    protected int code;
    protected CharSequence codeDescript;

    public BaseCodeBean() {
    }

    public BaseCodeBean(int code) {
        this.code = code;
    }

    public BaseCodeBean(int code, CharSequence codeDescript) {
        this.code = code;
        this.codeDescript = codeDescript;
    }

    public BaseCodeBean(int id, int code) {
        super(id);
        this.code = code;
    }

    public BaseCodeBean(int id, int code, CharSequence codeDescript) {
        super(id);
        this.code = code;
        this.codeDescript = codeDescript;
    }

    @Override
    public String toString() {
        return "BaseCodeBean{" +
                "code=" + code +
                ", codeDescript=" + codeDescript +
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

        BaseCodeBean that = (BaseCodeBean) o;

        if (code != that.code) return false;
        return codeDescript != null ? codeDescript.equals(that.codeDescript) : that.codeDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + code;
        result = 31 * result + (codeDescript != null ? codeDescript.hashCode() : 0);
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
    public CharSequence getCodeDescript() {
        return codeDescript;
    }

    @Override
    public T setCodeDescript(CharSequence codeDescript) {
        this.codeDescript = codeDescript;
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
        if (codeDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) codeDescript, flags);
        else    if (codeDescript instanceof Serializable)
            dest.writeSerializable((Serializable) codeDescript);
        else
            dest.writeString(codeDescript == null?null:codeDescript.toString());
    }

    protected BaseCodeBean(Parcel in) {
        super(in);
        this.code = in.readInt();
        if (codeDescript instanceof Parcelable)
            this.codeDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (codeDescript instanceof Serializable)
            this.codeDescript = (CharSequence) in.readSerializable();
        else
            this.codeDescript = in.readString();
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


