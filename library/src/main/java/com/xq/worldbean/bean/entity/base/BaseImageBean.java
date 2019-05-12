package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ImageBehavior;

public class BaseImageBean<T extends BaseImageBean> extends BaseBean<T> implements ImageBehavior<T> {

    protected int imageRes;
    protected String imageUrl;

    public BaseImageBean() {
    }

    public BaseImageBean(int imageRes) {
        this.imageRes = imageRes;
    }

    public BaseImageBean(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BaseImageBean(int id, int imageRes) {
        super(id);
        this.imageRes = imageRes;
    }

    public BaseImageBean(int id, String imageUrl) {
        super(id);
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "BaseImageBean{" +
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

        BaseImageBean imageBean = (BaseImageBean) o;

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

    @Override
    public T setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return (T) this;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public T setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return (T) this;
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

    protected BaseImageBean(Parcel in) {
        super(in);
        this.imageRes = in.readInt();
        this.imageUrl = in.readString();
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
