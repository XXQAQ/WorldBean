package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ImageBehavior;

public class ImageBean extends ParentBean implements ImageBehavior {

    protected int imageRes;
    protected String imageUrl;

    public ImageBean() {
    }

    public ImageBean(int imageRes) {
        this.imageRes = imageRes;
    }

    public ImageBean(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ImageBean(int id, int imageRes) {
        super(id);
        this.imageRes = imageRes;
    }

    public ImageBean(int id, String imageUrl) {
        super(id);
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ImageBean{" +
                "imageRes=" + imageRes +
                ", imageUrl='" + imageUrl + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ImageBean imageBean = (ImageBean) o;

        if (imageRes != imageBean.imageRes) return false;
        return imageUrl != null ? imageUrl.equals(imageBean.imageUrl) : imageBean.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + imageRes;
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }

    @Override
    public int getImageRes() {
        return imageRes;
    }

    public ImageBean setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return this;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    public ImageBean setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Override
    public ImageBean setId(int id) {
        return (ImageBean) super.setId(id);
    }

    @Override
    public ImageBean setTag(Object tag) {
        return (ImageBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.imageRes);
        dest.writeString(this.imageUrl);
    }

    protected ImageBean(Parcel in) {
        super(in);
        this.imageRes = in.readInt();
        this.imageUrl = in.readString();
    }

    public static final Creator<ImageBean> CREATOR = new Creator<ImageBean>() {
        @Override
        public ImageBean createFromParcel(Parcel source) {
            return new ImageBean(source);
        }

        @Override
        public ImageBean[] newArray(int size) {
            return new ImageBean[size];
        }
    };
}
