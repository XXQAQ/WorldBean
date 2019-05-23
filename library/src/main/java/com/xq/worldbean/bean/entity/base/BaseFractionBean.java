package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.FractionBehavior;
import java.io.Serializable;

public class BaseFractionBean<T extends BaseFractionBean> extends BaseBean<T> implements FractionBehavior<T> {

    protected float fraction;
    protected CharSequence fractionDescriptor;

    public BaseFractionBean() {
    }

    public BaseFractionBean(float fraction) {
        this.fraction = fraction;
    }

    public BaseFractionBean(float fraction, CharSequence fractionDescriptor) {
        this.fraction = fraction;
        this.fractionDescriptor = fractionDescriptor;
    }

    @Override
    public String toString() {
        return "BaseFractionBean{" +
                "fraction=" + fraction +
                ", fractionDescriptor=" + fractionDescriptor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseFractionBean that = (BaseFractionBean) o;

        if (Float.compare(that.fraction, fraction) != 0) return false;
        return fractionDescriptor != null ? fractionDescriptor.equals(that.fractionDescriptor) : that.fractionDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fraction != +0.0f ? Float.floatToIntBits(fraction) : 0);
        result = 31 * result + (fractionDescriptor != null ? fractionDescriptor.hashCode() : 0);
        return result;
    }

    @Override
    public float getFraction() {
        return fraction;
    }

    @Override
    public T setFraction(float fraction) {
        this.fraction = fraction;
        return (T) this;
    }

    @Override
    public CharSequence getFractionDescriptor() {
        return fractionDescriptor;
    }

    @Override
    public T setFractionDescriptor(CharSequence fractionDescriptor) {
        this.fractionDescriptor = fractionDescriptor;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeFloat(this.fraction);
        if (fractionDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) fractionDescriptor, flags);
        else    if (fractionDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) fractionDescriptor);
        else
            dest.writeString(fractionDescriptor == null?null: fractionDescriptor.toString());
    }

    protected BaseFractionBean(Parcel in) {
        super(in);
        this.fraction = in.readFloat();
        if (fractionDescriptor instanceof Parcelable)
            this.fractionDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (fractionDescriptor instanceof Serializable)
            this.fractionDescriptor = (CharSequence) in.readSerializable();
        else
            this.fractionDescriptor = in.readString();
    }

    public static final Creator<BaseFractionBean> CREATOR = new Creator<BaseFractionBean>() {
        @Override
        public BaseFractionBean createFromParcel(Parcel source) {
            return new BaseFractionBean(source);
        }

        @Override
        public BaseFractionBean[] newArray(int size) {
            return new BaseFractionBean[size];
        }
    };
}
