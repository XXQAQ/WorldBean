package com.xq.worldbean.bean.entity.base;

import android.os.Bundle;
import android.os.Parcel;
import com.xq.worldbean.bean.behavior.FragmentBehavior;

public class BaseFragmentBean extends BaseBean implements FragmentBehavior {

    protected String fragmentName;
    protected Bundle fragmentArguments;

    public BaseFragmentBean() {
    }

    public BaseFragmentBean(String fragmentName) {
        this.fragmentName = fragmentName;
    }

    public BaseFragmentBean(String fragmentName, Bundle fragmentArguments) {
        this.fragmentName = fragmentName;
        this.fragmentArguments = fragmentArguments;
    }

    public BaseFragmentBean(String id, String fragmentName) {
        super(id);
        this.fragmentName = fragmentName;
    }

    public BaseFragmentBean(String id, String fragmentName, Bundle fragmentArguments) {
        super(id);
        this.fragmentName = fragmentName;
        this.fragmentArguments = fragmentArguments;
    }

    @Override
    public String toString() {
        return "BaseFragmentBean{" +
                "fragmentName='" + fragmentName + '\'' +
                ", fragmentArguments=" + fragmentArguments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseFragmentBean that = (BaseFragmentBean) o;

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

    protected BaseFragmentBean(Parcel in) {
        super(in);
        this.fragmentName = in.readString();
        this.fragmentArguments = in.readBundle();
    }

    public static final Creator<BaseFragmentBean> CREATOR = new Creator<BaseFragmentBean>() {
        @Override
        public BaseFragmentBean createFromParcel(Parcel source) {
            return new BaseFragmentBean(source);
        }

        @Override
        public BaseFragmentBean[] newArray(int size) {
            return new BaseFragmentBean[size];
        }
    };
}
