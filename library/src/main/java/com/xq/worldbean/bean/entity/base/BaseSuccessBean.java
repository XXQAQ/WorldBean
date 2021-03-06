package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;

import com.xq.worldbean.bean.behavior.SuccessBehavior;

public class BaseSuccessBean extends BaseBean implements SuccessBehavior {

    protected boolean isSuccess;

    public BaseSuccessBean() {
    }

    public BaseSuccessBean(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public BaseSuccessBean(String id, boolean isSuccess) {
        super(id);
        this.isSuccess = isSuccess;
    }

    @Override
    public String toString() {
        return "BaseSuccessBean{" +
                "isSuccess=" + isSuccess +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseSuccessBean that = (BaseSuccessBean) o;

        return isSuccess == that.isSuccess;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isSuccess ? 1 : 0);
        return result;
    }

    @Override
    public boolean isSuccess() {
        return isSuccess;
    }

    @Override
    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
    }

    protected BaseSuccessBean(Parcel in) {
        super(in);
        this.isSuccess = in.readByte() != 0;
    }

    public static final Parcelable.Creator<BaseSuccessBean> CREATOR = new Parcelable.Creator<BaseSuccessBean>() {
        @Override
        public BaseSuccessBean createFromParcel(Parcel source) {
            return new BaseSuccessBean(source);
        }

        @Override
        public BaseSuccessBean[] newArray(int size) {
            return new BaseSuccessBean[size];
        }
    };
}
