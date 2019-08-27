package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.TitleBehavior;
import java.io.Serializable;

public class BaseTitleBean extends BaseBean implements TitleBehavior {

    protected CharSequence title;

    public BaseTitleBean() {
    }

    public BaseTitleBean(CharSequence title) {
        this.title = title;
    }

    public BaseTitleBean(String id, CharSequence title) {
        super(id);
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
    public void setTitle(CharSequence title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        writeObject(dest,flags,title);
    }

    protected BaseTitleBean(Parcel in) {
        super(in);
        this.title = (CharSequence) readObject(in);
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
