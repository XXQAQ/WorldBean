package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.TypeBehavior;
import java.io.Serializable;

public class BaseTypeBean<T extends BaseTypeBean> extends BaseBean<T> implements TypeBehavior<T> {

    protected int type;
    protected CharSequence typeDescript;

    public BaseTypeBean() {
    }

    public BaseTypeBean(int type) {
        this.type = type;
    }

    public BaseTypeBean(int type, CharSequence typeDescript) {
        this.type = type;
        this.typeDescript = typeDescript;
    }

    public BaseTypeBean(int id, int type) {
        super(id);
        this.type = type;
    }

    public BaseTypeBean(int id, int type, CharSequence typeDescript) {
        super(id);
        this.type = type;
        this.typeDescript = typeDescript;
    }

    @Override
    public String toString() {
        return "BaseTypeBean{" +
                "type=" + type +
                ", typeDescript=" + typeDescript +
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

        BaseTypeBean that = (BaseTypeBean) o;

        if (type != that.type) return false;
        return typeDescript != null ? typeDescript.equals(that.typeDescript) : that.typeDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type;
        result = 31 * result + (typeDescript != null ? typeDescript.hashCode() : 0);
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
    public CharSequence getTypeDescript() {
        return typeDescript;
    }

    @Override
    public T setTypeDescript(CharSequence typeDescript) {
        this.typeDescript = typeDescript;
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
        if (typeDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) typeDescript, flags);
        else    if (typeDescript instanceof Serializable)
            dest.writeSerializable((Serializable) typeDescript);
        else
            dest.writeString(typeDescript == null?null:typeDescript.toString());
    }

    protected BaseTypeBean(Parcel in) {
        super(in);
        this.type = in.readInt();
        if (typeDescript instanceof Parcelable)
            this.typeDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (typeDescript instanceof Serializable)
            this.typeDescript = (CharSequence) in.readSerializable();
        else
            this.typeDescript = in.readString();
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
