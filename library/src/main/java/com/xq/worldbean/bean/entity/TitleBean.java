package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.TitleBehavior;
import java.io.Serializable;

public class TitleBean extends ParentBean implements TitleBehavior {

    protected CharSequence title;
    protected String titleRole;

    public TitleBean() {
    }

    public TitleBean(CharSequence title) {
        this.title = title;
    }

    public TitleBean(int id, CharSequence title) {
        super(id);
        this.title = title;
    }

    @Override
    public String toString() {
        return "TitleBean{" +
                "title=" + title +
                ", titleRole='" + titleRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TitleBean titleBean = (TitleBean) o;

        if (title != null ? !title.equals(titleBean.title) : titleBean.title != null) return false;
        return titleRole != null ? titleRole.equals(titleBean.titleRole) : titleBean.titleRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (titleRole != null ? titleRole.hashCode() : 0);
        return result;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    public TitleBean setTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    @Override
    public String getTitleRole() {
        return titleRole;
    }

    public TitleBean setTitleRole(String titleRole) {
        this.titleRole = titleRole;
        return this;
    }

    @Override
    public TitleBean setId(int id) {
        return (TitleBean) super.setId(id);
    }

    @Override
    public TitleBean setIdRole(String idRole) {
        return (TitleBean) super.setIdRole(idRole);
    }

    @Override
    public TitleBean setTag(Object tag) {
        return (TitleBean) super.setTag(tag);
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
        dest.writeString(titleRole);
    }

    protected TitleBean(Parcel in) {
        super(in);
        if (title instanceof Parcelable)
            this.title = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (title instanceof Serializable)
            this.title = (CharSequence) in.readSerializable();
        else
            this.title = in.readString();
        this.titleRole = in.readString();
    }

    public static final Parcelable.Creator<TitleBean> CREATOR = new Parcelable.Creator<TitleBean>() {
        @Override
        public TitleBean createFromParcel(Parcel source) {
            return new TitleBean(source);
        }

        @Override
        public TitleBean[] newArray(int size) {
            return new TitleBean[size];
        }
    };
}
