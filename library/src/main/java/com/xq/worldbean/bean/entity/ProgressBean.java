package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.ProgressBehavior;
import java.io.Serializable;

public class ProgressBean extends ParentBean implements ProgressBehavior {

    protected float progress;
    protected CharSequence progressDescript;
    protected String progressRole;

    public ProgressBean() {
    }

    public ProgressBean(float progress) {
        this.progress = progress;
    }

    public ProgressBean(float progress, CharSequence progressDescript) {
        this.progress = progress;
        this.progressDescript = progressDescript;
    }

    public ProgressBean(int id, float progress) {
        super(id);
        this.progress = progress;
    }

    public ProgressBean(int id, float progress, CharSequence progressDescript) {
        super(id);
        this.progress = progress;
        this.progressDescript = progressDescript;
    }

    @Override
    public String toString() {
        return "ProgressBean{" +
                "progress=" + progress +
                ", progressDescript=" + progressDescript +
                ", progressRole='" + progressRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                ", tagRole='" + tagRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProgressBean that = (ProgressBean) o;

        if (Float.compare(that.progress, progress) != 0) return false;
        if (progressDescript != null ? !progressDescript.equals(that.progressDescript) : that.progressDescript != null)
            return false;
        return progressRole != null ? progressRole.equals(that.progressRole) : that.progressRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (progress != +0.0f ? Float.floatToIntBits(progress) : 0);
        result = 31 * result + (progressDescript != null ? progressDescript.hashCode() : 0);
        result = 31 * result + (progressRole != null ? progressRole.hashCode() : 0);
        return result;
    }

    @Override
    public float getProgress() {
        return progress;
    }

    public ProgressBean setProgress(float progress) {
        this.progress = progress;
        return this;
    }

    @Override
    public CharSequence getProgressDescript() {
        return progressDescript;
    }

    public ProgressBean setProgressDescript(CharSequence progressDescript) {
        this.progressDescript = progressDescript;
        return this;
    }

    @Override
    public String getProgressRole() {
        return progressRole;
    }

    public ProgressBean setProgressRole(String progressRole) {
        this.progressRole = progressRole;
        return this;
    }

    @Override
    public ProgressBean setId(int id) {
        return (ProgressBean) super.setId(id);
    }

    @Override
    public ProgressBean setIdRole(String idRole) {
        return (ProgressBean) super.setIdRole(idRole);
    }

    @Override
    public ProgressBean setTag(Object tag) {
        return (ProgressBean) super.setTag(tag);
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
        dest.writeString(this.progressRole);
    }

    protected ProgressBean(Parcel in) {
        super(in);
        this.progress = in.readFloat();
        if (progressDescript instanceof Parcelable)
            this.progressDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (progressDescript instanceof Serializable)
            this.progressDescript = (CharSequence) in.readSerializable();
        else
            this.progressDescript = in.readString();
        this.progressRole = in.readString();
    }

    public static final Creator<ProgressBean> CREATOR = new Creator<ProgressBean>() {
        @Override
        public ProgressBean createFromParcel(Parcel source) {
            return new ProgressBean(source);
        }

        @Override
        public ProgressBean[] newArray(int size) {
            return new ProgressBean[size];
        }
    };
}
