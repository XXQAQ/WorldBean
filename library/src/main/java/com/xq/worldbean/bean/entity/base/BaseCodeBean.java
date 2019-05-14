package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.CodeBehavior;
import java.io.Serializable;

public class BaseCodeBean<T extends BaseCodeBean> extends BaseBean<T> implements CodeBehavior<T> {

    protected int code;
    protected CharSequence codeDescriptor;

    public BaseCodeBean() {
    }

    public BaseCodeBean(int code) {
        this.code = code;
    }

    public BaseCodeBean(int code, CharSequence codeDescriptor) {
        this.code = code;
        this.codeDescriptor = codeDescriptor;
    }

    public BaseCodeBean(int id, int code) {
        super(id);
        this.code = code;
    }

    public BaseCodeBean(int id, int code, CharSequence codeDescriptor) {
        super(id);
        this.code = code;
        this.codeDescriptor = codeDescriptor;
    }

    @Override
    public String toString() {
        return "BaseCodeBean{" +
                "code=" + code +
                ", codeDescriptor=" + codeDescriptor +
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
        return codeDescriptor != null ? codeDescriptor.equals(that.codeDescriptor) : that.codeDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + code;
        result = 31 * result + (codeDescriptor != null ? codeDescriptor.hashCode() : 0);
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
    public CharSequence getCodeDescriptor() {
        return codeDescriptor;
    }

    @Override
    public T setCodeDescriptor(CharSequence codeDescriptor) {
        this.codeDescriptor = codeDescriptor;
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
        if (codeDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) codeDescriptor, flags);
        else    if (codeDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) codeDescriptor);
        else
            dest.writeString(codeDescriptor == null?null:codeDescriptor.toString());
    }

    protected BaseCodeBean(Parcel in) {
        super(in);
        this.code = in.readInt();
        if (codeDescriptor instanceof Parcelable)
            this.codeDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (codeDescriptor instanceof Serializable)
            this.codeDescriptor = (CharSequence) in.readSerializable();
        else
            this.codeDescriptor = in.readString();
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


