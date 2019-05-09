package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.ProgressBehavior;
import java.io.Serializable;

public class BaseProgressBean<T extends BaseProgressBean> extends BaseBean implements ProgressBehavior {

    protected float progress;
    protected CharSequence progressDescript;

    public BaseProgressBean() {
    }

    public BaseProgressBean(float progress) {
        this.progress = progress;
    }

    public BaseProgressBean(float progress, CharSequence progressDescript) {
        this.progress = progress;
        this.progressDescript = progressDescript;
    }

    public BaseProgressBean(int id, float progress) {
        super(id);
        this.progress = progress;
    }

    public BaseProgressBean(int id, float progress, CharSequence progressDescript) {
        super(id);
        this.progress = progress;
        this.progressDescript = progressDescript;
    }

    @Override
    public String toString() {
        return "BaseProgressBean{" +
                "progress=" + progress +
                ", progressDescript=" + progressDescript +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseProgressBean that = (BaseProgressBean) o;

        if (Float.compare(that.progress, progress) != 0) return false;
        return progressDescript != null ? progressDescript.equals(that.progressDescript) : that.progressDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (progress != +0.0f ? Float.floatToIntBits(progress) : 0);
        result = 31 * result + (progressDescript != null ? progressDescript.hashCode() : 0);
        return result;
    }

    @Override
    public float getProgress() {
        return progress;
    }

    public T setProgress(float progress) {
        this.progress = progress;
        return (T) this;
    }

    @Override
    public CharSequence getProgressDescript() {
        return progressDescript;
    }

    public T setProgressDescript(CharSequence progressDescript) {
        this.progressDescript = progressDescript;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeFloat(this.progress);
        if (progressDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) progressDescript, flags);
        else    if (progressDescript instanceof Serializable)
            dest.writeSerializable((Serializable) progressDescript);
        else
            dest.writeString(progressDescript == null?null:progressDescript.toString());
    }

    protected BaseProgressBean(Parcel in) {
        super(in);
        this.progress = in.readFloat();
        if (progressDescript instanceof Parcelable)
            this.progressDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (progressDescript instanceof Serializable)
            this.progressDescript = (CharSequence) in.readSerializable();
        else
            this.progressDescript = in.readString();
    }

    public static final Creator<BaseProgressBean> CREATOR = new Creator<BaseProgressBean>() {
        @Override
        public BaseProgressBean createFromParcel(Parcel source) {
            return new BaseProgressBean(source);
        }

        @Override
        public BaseProgressBean[] newArray(int size) {
            return new BaseProgressBean[size];
        }
    };
}
