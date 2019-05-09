package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.SimpleUIBehavior;

import java.io.Serializable;

public class SimpleUIBean extends ParentBean implements SimpleUIBehavior {

    protected CharSequence title;
    protected CharSequence content;
    protected Number number;
    protected int imageRes;
    protected String imageUrl;
    protected String titleRole;
    protected String contentRole;
    protected String numberRole;
    protected String imageRole;

    public SimpleUIBean() {

    }

    @Override
    public String toString() {
        return "SimpleUIBean{" +
                "title=" + title +
                ", content=" + content +
                ", number=" + number +
                ", imageRes=" + imageRes +
                ", imageUrl='" + imageUrl + '\'' +
                ", titleRole='" + titleRole + '\'' +
                ", contentRole='" + contentRole + '\'' +
                ", numberRole='" + numberRole + '\'' +
                ", imageRole='" + imageRole + '\'' +
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

        SimpleUIBean that = (SimpleUIBean) o;

        if (imageRes != that.imageRes) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
            return false;
        if (titleRole != null ? !titleRole.equals(that.titleRole) : that.titleRole != null)
            return false;
        if (contentRole != null ? !contentRole.equals(that.contentRole) : that.contentRole != null)
            return false;
        if (numberRole != null ? !numberRole.equals(that.numberRole) : that.numberRole != null)
            return false;
        return imageRole != null ? imageRole.equals(that.imageRole) : that.imageRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + imageRes;
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (titleRole != null ? titleRole.hashCode() : 0);
        result = 31 * result + (contentRole != null ? contentRole.hashCode() : 0);
        result = 31 * result + (numberRole != null ? numberRole.hashCode() : 0);
        result = 31 * result + (imageRole != null ? imageRole.hashCode() : 0);
        return result;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    public SimpleUIBean setTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    @Override
    public CharSequence getContent() {
        return content;
    }

    public SimpleUIBean setContent(CharSequence content) {
        this.content = content;
        return this;
    }

    @Override
    public Number getNumber() {
        return number;
    }

    public SimpleUIBean setNumber(Number number) {
        this.number = number;
        return this;
    }

    @Override
    public int getImageRes() {
        return imageRes;
    }

    public SimpleUIBean setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return this;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    public SimpleUIBean setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Override
    public String getTitleRole() {
        return titleRole;
    }

    public SimpleUIBean setTitleRole(String titleRole) {
        this.titleRole = titleRole;
        return this;
    }

    @Override
    public String getContentRole() {
        return contentRole;
    }

    public SimpleUIBean setContentRole(String contentRole) {
        this.contentRole = contentRole;
        return this;
    }

    @Override
    public String getNumberRole() {
        return numberRole;
    }

    public SimpleUIBean setNumberRole(String numberRole) {
        this.numberRole = numberRole;
        return this;
    }

    @Override
    public String getImageRole() {
        return imageRole;
    }

    public SimpleUIBean setImageRole(String imageRole) {
        this.imageRole = imageRole;
        return this;
    }

    @Override
    public SimpleUIBean setId(int id) {
        return (SimpleUIBean) super.setId(id);
    }

    @Override
    public SimpleUIBean setIdRole(String idRole) {
        return (SimpleUIBean) super.setIdRole(idRole);
    }

    @Override
    public SimpleUIBean setTag(Object tag) {
        return (SimpleUIBean) super.setTag(tag);
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
        if (content instanceof Parcelable)
            dest.writeParcelable((Parcelable) content, flags);
        else    if (content instanceof Serializable)
            dest.writeSerializable((Serializable) content);
        else
            dest.writeString(content == null?null:content.toString());
        dest.writeSerializable(this.number);
        dest.writeInt(this.imageRes);
        dest.writeString(this.imageUrl);
        dest.writeString(this.titleRole);
        dest.writeString(this.contentRole);
        dest.writeString(this.numberRole);
        dest.writeString(this.imageRole);
    }

    protected SimpleUIBean(Parcel in) {
        super(in);
        if (title instanceof Parcelable)
            this.title = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (title instanceof Serializable)
            this.title = (CharSequence) in.readSerializable();
        else
            this.title = in.readString();
        if (content instanceof Parcelable)
            this.content = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (content instanceof Serializable)
            this.content = (CharSequence) in.readSerializable();
        else
            this.content = in.readString();
        this.number = (Number) in.readSerializable();
        this.imageRes = in.readInt();
        this.imageUrl = in.readString();
        this.titleRole = in.readString();
        this.contentRole = in.readString();
        this.numberRole = in.readString();
        this.imageRole = in.readString();
    }

    public static final Creator<SimpleUIBean> CREATOR = new Creator<SimpleUIBean>() {
        @Override
        public SimpleUIBean createFromParcel(Parcel source) {
            return new SimpleUIBean(source);
        }

        @Override
        public SimpleUIBean[] newArray(int size) {
            return new SimpleUIBean[size];
        }
    };
}
