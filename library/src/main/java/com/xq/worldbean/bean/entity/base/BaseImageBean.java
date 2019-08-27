package com.xq.worldbean.bean.entity.base;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ImageBehavior;
import com.xq.worldbean.util.ImageResourceConverter;

public class BaseImageBean extends BaseBean implements ImageBehavior {

    protected Drawable imageDrawable;
    protected String imageUrl;

    public BaseImageBean() {
    }

    public BaseImageBean(int imageRes) {
        this.imageDrawable = ImageResourceConverter.getInstance().convert(imageRes);
    }

    public BaseImageBean(Drawable imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public BaseImageBean(String id, int imageRes) {
        super(id);
        this.imageDrawable = ImageResourceConverter.getInstance().convert(imageRes);
    }

    public BaseImageBean(String id, Drawable imageDrawable) {
        super(id);
        this.imageDrawable = imageDrawable;
    }

    public BaseImageBean(String id, String imageUrl) {
        super(id);
        this.imageUrl = imageUrl;
    }

    public BaseImageBean(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "BaseImageBean{" +
                "imageDrawable=" + imageDrawable +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseImageBean that = (BaseImageBean) o;

        if (imageDrawable != null ? !imageDrawable.equals(that.imageDrawable) : that.imageDrawable != null) return false;
        return imageUrl != null ? imageUrl.equals(that.imageUrl) : that.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (imageDrawable != null ? imageDrawable.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }

    @Override
    public void setImageDrawable(Drawable imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    @Override
    public Drawable getImageDrawable() {
        return imageDrawable;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.imageUrl);
        writeDrawable(dest,imageDrawable);
    }

    protected BaseImageBean(Parcel in) {
        super(in);
        this.imageUrl = in.readString();
        this.imageDrawable = readDrawable(in);
    }

    public static final Creator<BaseImageBean> CREATOR = new Creator<BaseImageBean>() {
        @Override
        public BaseImageBean createFromParcel(Parcel source) {
            return new BaseImageBean(source);
        }

        @Override
        public BaseImageBean[] newArray(int size) {
            return new BaseImageBean[size];
        }
    };
}
