package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.FractionBehavior;

public class BaseFractionBean extends BaseBean implements FractionBehavior {

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
    public void setFraction(float fraction) {
        this.fraction = fraction;
    }

    @Override
    public CharSequence getFractionDescriptor() {
        return fractionDescriptor;
    }

    @Override
    public void setFractionDescriptor(CharSequence fractionDescriptor) {
        this.fractionDescriptor = fractionDescriptor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeFloat(this.fraction);
        writeObject(dest,flags,fractionDescriptor);
    }

    protected BaseFractionBean(Parcel in) {
        super(in);
        this.fraction = in.readFloat();
        this.fractionDescriptor = (CharSequence) readObject(in);
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
