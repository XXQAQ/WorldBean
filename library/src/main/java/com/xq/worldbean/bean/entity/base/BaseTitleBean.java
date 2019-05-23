package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.TitleBehavior;
import java.io.Serializable;

public class BaseTitleBean<T extends BaseTitleBean> extends BaseBean<T> implements TitleBehavior<T> {

    protected CharSequence title;

    public BaseTitleBean() {
    }

    public BaseTitleBean(CharSequence title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BaseTitleBean{" +
                "title=" + title +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseTitleBean that = (BaseTitleBean) o;

        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    @Override
    public T setTitle(CharSequence title) {
        this.title = title;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if (title instanceof Parcelable)
            dest.writeParcelable((Parcelable) title, flags);
        else    if (title instanceof Serializable)
            dest.writeSerializable((Serializable) title);
        else
            dest.writeString(title == null?null:title.toString());
    }

    protected BaseTitleBean(Parcel in) {
        super(in);
        if (title instanceof Parcelable)
            this.title = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (title instanceof Serializable)
            this.title = (CharSequence) in.readSerializable();
        else
            this.title = in.readString();
    }

    public static final Parcelable.Creator<BaseTitleBean> CREATOR = new Parcelable.Creator<BaseTitleBean>() {
        @Override
        public BaseTitleBean createFromParcel(Parcel source) {
            return new BaseTitleBean(source);
        }

        @Override
        public BaseTitleBean[] newArray(int size) {
            return new BaseTitleBean[size];
        }
    };
}
