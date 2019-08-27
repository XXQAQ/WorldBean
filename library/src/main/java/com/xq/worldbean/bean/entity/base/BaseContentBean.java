package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.ContentBehavior;

public class BaseContentBean extends BaseBean implements ContentBehavior {

    protected CharSequence content;

    public BaseContentBean() {
    }

    public BaseContentBean(CharSequence content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BaseContentBean{" +
                "content=" + content +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseContentBean that = (BaseContentBean) o;

        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public CharSequence getContent() {
        return content;
    }

    @Override
    public void setContent(CharSequence content) {
        this.content = content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        writeObject(dest,flags,content);
    }

    protected BaseContentBean(Parcel in) {
        super(in);
        this.content = (CharSequence) readObject(in);
    }

    public static final Creator<BaseContentBean> CREATOR = new Creator<BaseContentBean>() {
        @Override
        public BaseContentBean createFromParcel(Parcel source) {
            return new BaseContentBean(source);
        }

        @Override
        public BaseContentBean[] newArray(int size) {
            return new BaseContentBean[size];
        }
    };
}
