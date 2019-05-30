package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;

import com.xq.worldbean.bean.behavior.PositionBehavior;

public class BasePositionBean<T extends BasePositionBean> extends BaseBean<T> implements PositionBehavior<T> {

    protected int position;
    protected int startPosition;
    protected int endPosition;

    public BasePositionBean() {
    }

    public BasePositionBean(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "BasePositionBean{" +
                "position=" + position +
                ", startPosition=" + startPosition +
                ", endPosition=" + endPosition +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BasePositionBean that = (BasePositionBean) o;

        if (position != that.position) return false;
        if (startPosition != that.startPosition) return false;
        return endPosition == that.endPosition;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + position;
        result = 31 * result + startPosition;
        result = 31 * result + endPosition;
        return result;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public T setPosition(int position) {
        this.position = position;
        return (T) this;
    }

    @Override
    public int getStartPosition() {
        return startPosition;
    }

    @Override
    public T setStartPosition(int startPosition) {
        this.startPosition = startPosition;
        return (T) this;
    }

    @Override
    public int getEndPosition() {
        return endPosition;
    }

    @Override
    public T setEndPosition(int endPosition) {
        this.endPosition = endPosition;
        return (T) this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.position);
        dest.writeInt(this.startPosition);
        dest.writeInt(this.endPosition);
    }

    protected BasePositionBean(Parcel in) {
        super(in);
        this.position = in.readInt();
        this.startPosition = in.readInt();
        this.endPosition = in.readInt();
    }

    public static final Creator<BasePositionBean> CREATOR = new Creator<BasePositionBean>() {
        @Override
        public BasePositionBean createFromParcel(Parcel source) {
            return new BasePositionBean(source);
        }

        @Override
        public BasePositionBean[] newArray(int size) {
            return new BasePositionBean[size];
        }
    };
}
