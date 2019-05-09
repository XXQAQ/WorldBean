package com.xq.worldbean.bean.entity.base;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.xq.worldbean.bean.behavior.FragmentTitleBehavior;
import java.lang.reflect.Constructor;

public class BaseFragmentTitleBean<T extends BaseFragmentTitleBean> extends BaseTitleBean implements FragmentTitleBehavior {

    protected Fragment fragment;

    public BaseFragmentTitleBean() {
    }

    public BaseFragmentTitleBean(Fragment fragment) {
        this.fragment = fragment;
    }

    public BaseFragmentTitleBean(CharSequence title, Fragment fragment) {
        super(title);
        this.fragment = fragment;
    }

    public BaseFragmentTitleBean(int id, CharSequence title, Fragment fragment) {
        super(id,title);
        this.fragment = fragment;
    }

    @Override
    public String toString() {
        return "BaseFragmentTitleBean{" +
                "fragment=" + fragment +
                ", title=" + title +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseFragmentTitleBean that = (BaseFragmentTitleBean) o;

        return fragment != null ? fragment.equals(that.fragment) : that.fragment == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fragment != null ? fragment.hashCode() : 0);
        return result;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public T setFragment(Fragment fragment) {
        this.fragment = fragment;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(fragment.getClass().getName());
        dest.writeBundle(fragment.getArguments());
    }

    protected BaseFragmentTitleBean(Parcel in) {
        super(in);
        String fragmentName = in.readString();
        Bundle bundle = in.readBundle();
        try {
            Constructor constructor = Class.forName(fragmentName).getDeclaredConstructor();
            constructor.setAccessible(true);
            Fragment fragment = (Fragment) constructor.newInstance();
            fragment.setArguments(bundle);
            this.fragment = fragment;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final Parcelable.Creator<BaseFragmentTitleBean> CREATOR = new Parcelable.Creator<BaseFragmentTitleBean>() {
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
