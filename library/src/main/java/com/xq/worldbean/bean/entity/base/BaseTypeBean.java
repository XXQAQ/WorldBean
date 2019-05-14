package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.TypeBehavior;
import java.io.Serializable;

public class BaseTypeBean<T extends BaseTypeBean> extends BaseBean<T> implements TypeBehavior<T> {

    protected int type;
    protected CharSequence typeDescriptor;

    public BaseTypeBean() {
    }

    public BaseTypeBean(int type) {
        this.type = type;
    }

    public BaseTypeBean(int type, CharSequence typeDescriptor) {
        this.type = type;
        this.typeDescriptor = typeDescriptor;
    }

    public BaseTypeBean(int id, int type) {
        super(id);
        this.type = type;
    }

    public BaseTypeBean(int id, int type, CharSequence typeDescriptor) {
        super(id);
        this.type = type;
        this.typeDescriptor = typeDescriptor;
    }

    @Override
    public String toString() {
        return "BaseTypeBean{" +
                "type=" + type +
                ", typeDescriptor=" + typeDescriptor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseTypeBean that = (BaseTypeBean) o;

        if (type != that.type) return false;
        return typeDescriptor != null ? typeDescriptor.equals(that.typeDescriptor) : that.typeDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type;
        result = 31 * result + (typeDescriptor != null ? typeDescriptor.hashCode() : 0);
        return result;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public T setType(int type) {
        this.type = type;
        return (T) this;
    }

    @Override
    public CharSequence getTypeDescriptor() {
        return typeDescriptor;
    }

    @Override
    public T setTypeDescriptor(CharSequence typeDescriptor) {
        this.typeDescriptor = typeDescriptor;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type);
        if (typeDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) typeDescriptor, flags);
        else    if (typeDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) typeDescriptor);
        else
            dest.writeString(typeDescriptor == null?null:typeDescriptor.toString());
    }

    protected BaseTypeBean(Parcel in) {
        super(in);
        this.type = in.readInt();
        if (typeDescriptor instanceof Parcelable)
            this.typeDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (typeDescriptor instanceof Serializable)
            this.typeDescriptor = (CharSequence) in.readSerializable();
        else
            this.typeDescriptor = in.readString();
    }

    public static final Creator<BaseTypeBean> CREATOR = new Creator<BaseTypeBean>() {
        @Override
        public BaseTypeBean createFromParcel(Parcel source) {
            return new BaseTypeBean(source);
        }

        @Override
        public BaseTypeBean[] newArray(int size) {
            return new BaseTypeBean[size];
        }
    };
}
