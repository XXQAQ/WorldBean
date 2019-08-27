package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import com.xq.worldbean.bean.behavior.LinkBehavior;

public class BaseLinkBean extends BaseBean implements LinkBehavior {

    protected String link;

    public BaseLinkBean() {
    }

    public BaseLinkBean(String link) {
        this.link = link;
    }

    public BaseLinkBean(String id, String link) {
        super(id);
        this.link = link;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.link);
    }

    protected BaseLinkBean(Parcel in) {
        super(in);
        this.link = in.readString();
    }

    public static final Creator<BaseLinkBean> CREATOR = new Creator<BaseLinkBean>() {
        @Override
        public BaseLinkBean createFromParcel(Parcel source) {
            return new BaseLinkBean(source);
        }

        @Override
        public BaseLinkBean[] newArray(int size) {
            return new BaseLinkBean[size];
        }
    };
}
