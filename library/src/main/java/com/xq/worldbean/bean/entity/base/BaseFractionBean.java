package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.FractionBehavior;
import java.io.Serializable;

public class BaseFractionBean<T extends BaseFractionBean> extends BaseBean<T> implements FractionBehavior<T> {

    protected float fraction;
    protected CharSequence fractionDescript;

    public BaseFractionBean() {
    }

    public BaseFractionBean(float fraction) {
        this.fraction = fraction;
    }

    public BaseFractionBean(float fraction, CharSequence fractionDescript) {
        this.fraction = fraction;
        this.fractionDescript = fractionDescript;
    }

    public BaseFractionBean(int id, float fraction) {
        super(id);
        this.fraction = fraction;
    }

    public BaseFractionBean(int id, float fraction, CharSequence fractionDescript) {
        super(id);
        this.fraction = fraction;
        this.fractionDescript = fractionDescript;
    }

    @Override
    public String toString() {
        return "BaseFractionBean{" +
                "fraction=" + fraction +
                ", fractionDescript=" + fractionDescript +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseFractionBean<?> that = (BaseFractionBean<?>) o;

        if (Float.compare(that.fraction, fraction) != 0) return false;
        return fractionDescript != null ? fractionDescript.equals(that.fractionDescript) : that.fractionDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fraction != +0.0f ? Float.floatToIntBits(fraction) : 0);
        result = 31 * result + (fractionDescript != null ? fractionDescript.hashCode() : 0);
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
    public CharSequence getFractionDescript() {
        return fractionDescript;
    }

    @Override
    public T setFractionDescript(CharSequence fractionDescript) {
        this.fractionDescript = fractionDescript;
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
        if (fractionDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) fractionDescript, flags);
        else    if (fractionDescript instanceof Serializable)
            dest.writeSerializable((Serializable) fractionDescript);
        else
            dest.writeString(fractionDescript == null?null: fractionDescript.toString());
    }

    protected BaseFractionBean(Parcel in) {
        super(in);
        this.fraction = in.readFloat();
        if (fractionDescript instanceof Parcelable)
            this.fractionDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (fractionDescript instanceof Serializable)
            this.fractionDescript = (CharSequence) in.readSerializable();
        else
            this.fractionDescript = in.readString();
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
