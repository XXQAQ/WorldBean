package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.xq.worldbean.bean.behavior.SuccessBehavior;

public class SuccessBean extends ParentBean implements SuccessBehavior {

    protected boolean isSuccess;
    protected String successRole;

    public SuccessBean() {
    }

    public SuccessBean(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public SuccessBean(int id,boolean isSuccess) {
        super(id);
        this.isSuccess = isSuccess;
    }

    @Override
    public String toString() {
        return "SuccessBean{" +
                "isSuccess=" + isSuccess +
                ", successRole='" + successRole + '\'' +
                ", tag=" + tag +
                ", id=" + id +
                ", idRole='" + idRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SuccessBean that = (SuccessBean) o;

        if (isSuccess != that.isSuccess) return false;
        return successRole != null ? successRole.equals(that.successRole) : that.successRole == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isSuccess ? 1 : 0);
        result = 31 * result + (successRole != null ? successRole.hashCode() : 0);
        return result;
    }

    @Override
    public boolean isSuccess() {
        return isSuccess;
    }

    public SuccessBean setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    @Override
    public String getSuccessRole() {
        return successRole;
    }

    public SuccessBean setSuccessRole(String successRole) {
        this.successRole = successRole;
        return this;
    }

    @Override
    public SuccessBean setId(int id) {
        super.setId(id);
        return this;
    }

    @Override
    public SuccessBean setIdRole(String idRole) {
        super.setIdRole(idRole);
        return this;
    }

    @Override
    public SuccessBean setTag(Object tag) {
        super.setTag(tag);
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        dest.writeString(this.successRole);
    }

    protected SuccessBean(Parcel in) {
        super(in);
        this.isSuccess = in.readByte() != 0;
        this.successRole = in.readString();
    }

    public static final Parcelable.Creator<SuccessBean> CREATOR = new Parcelable.Creator<SuccessBean>() {
        @Override
        public SuccessBean createFromParcel(Parcel source) {
            return new SuccessBean(source);
        }

        @Override
        public SuccessBean[] newArray(int size) {
            return new SuccessBean[size];
        }
    };
}
