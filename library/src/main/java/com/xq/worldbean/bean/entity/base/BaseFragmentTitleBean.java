package com.xq.worldbean.bean.entity.base;

import android.os.Bundle;
import android.os.Parcel;
import com.xq.worldbean.bean.behavior.FragmentBehavior;

public class BaseFragmentTitleBean extends BaseTitleBean implements FragmentBehavior {

    protected String fragmentName;
    protected Bundle fragmentArguments;

    public BaseFragmentTitleBean() {
    }

    public BaseFragmentTitleBean(CharSequence title, String fragmentName) {
        super(title);
        this.fragmentName = fragmentName;
    }

    public BaseFragmentTitleBean(CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(title);
        this.fragmentName = fragmentName;
        this.fragmentArguments = fragmentArguments;
    }

    public BaseFragmentTitleBean(String id, CharSequence title, String fragmentName) {
        super(id, title);
        this.fragmentName = fragmentName;
    }

    public BaseFragmentTitleBean(String id, CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(id, title);
        this.fragmentName = fragmentName;
        this.fragmentArguments = fragmentArguments;
    }

    @Override
    public String toString() {
        return "BaseFragmentTitleBean{" +
                "fragmentName='" + fragmentName + '\'' +
                ", fragmentArguments=" + fragmentArguments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseFragmentTitleBean that = (BaseFragmentTitleBean) o;

        if (fragmentName != null ? !fragmentName.equals(that.fragmentName) : that.fragmentName != null)
            return false;
        return fragmentArguments != null ? fragmentArguments.equals(that.fragmentArguments) : that.fragmentArguments == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fragmentName != null ? fragmentName.hashCode() : 0);
        result = 31 * result + (fragmentArguments != null ? fragmentArguments.hashCode() : 0);
        return result;
    }

    @Override
    public String getFragmentName() {
        return fragmentName;
    }

    @Override
    public void setFragmentName(String fragmentName) {
        this.fragmentName = fragmentName;
    }

    @Override
    public Bundle getFragmentArguments() {
        return fragmentArguments;
    }

    @Override
    public void setFragmentArguments(Bundle fragmentArguments) {
        this.fragmentArguments = fragmentArguments;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.fragmentName);
        if (fragmentArguments == null)  fragmentArguments = new Bundle();
        dest.writeBundle(this.fragmentArguments);
    }

    protected BaseFragmentTitleBean(Parcel in) {
        super(in);
        this.fragmentName = in.readString();
        this.fragmentArguments = in.readBundle();
    }

    public static final Creator<BaseFragmentTitleBean> CREATOR = new Creator<BaseFragmentTitleBean>() {
        @Override
        public BaseFragmentTitleBean createFromParcel(Parcel source) {
            return new BaseFragmentTitleBean(source);
        }

        @Override
        public BaseFragmentTitleBean[] newArray(int size) {
            return new BaseFragmentTitleBean[size];
        }
    };
}
