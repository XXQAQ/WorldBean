package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.TypeBehavior;

public class BaseTypeBean extends BaseBean implements TypeBehavior {

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

    public BaseTypeBean(String id, int type) {
        super(id);
        this.type = type;
    }

    public BaseTypeBean(String id, int type, CharSequence typeDescriptor) {
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
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public CharSequence getTypeDescriptor() {
        return typeDescriptor;
    }

    @Override
    public void setTypeDescriptor(CharSequence typeDescriptor) {
        this.typeDescriptor = typeDescriptor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type);
        writeObject(dest,flags,typeDescriptor);
    }

    protected BaseTypeBean(Parcel in) {
        super(in);
        this.type = in.readInt();
        this.typeDescriptor = (CharSequence) readObject(in);
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
