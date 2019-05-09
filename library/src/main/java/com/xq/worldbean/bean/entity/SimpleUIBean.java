package com.xq.worldbean.bean.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.SimpleUIBehavior;
import com.xq.worldbean.util.callback.UniverseCallback;
import java.io.Serializable;

public class SimpleUIBean extends ParentBean implements SimpleUIBehavior {

    protected CharSequence title;
    protected CharSequence content;
    protected Number number;
    protected int imageRes;
    protected String imageUrl;
    protected double x;
    protected double y;
    protected double z;
    protected int position;
    protected float progress;
    protected CharSequence progressDescript;
    protected boolean isSuccess;
    protected int state;
    protected CharSequence stateDescript;
    protected int type;
    protected double width;
    protected double height;
    protected UniverseCallback universeCallback;

    public SimpleUIBean() {

    }

    @Override
    public String toString() {
        return "SimpleUIBean{" +
                "title=" + title +
                ", content=" + content +
                ", number=" + number +
                ", imageRes=" + imageRes +
                ", imageUrl='" + imageUrl + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", position=" + position +
                ", progress=" + progress +
                ", progressDescript=" + progressDescript +
                ", isSuccess=" + isSuccess +
                ", state=" + state +
                ", stateDescript=" + stateDescript +
                ", type=" + type +
                ", width=" + width +
                ", height=" + height +
                ", tag=" + tag +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SimpleUIBean that = (SimpleUIBean) o;

        if (imageRes != that.imageRes) return false;
        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        if (Double.compare(that.z, z) != 0) return false;
        if (position != that.position) return false;
        if (Float.compare(that.progress, progress) != 0) return false;
        if (isSuccess != that.isSuccess) return false;
        if (state != that.state) return false;
        if (type != that.type) return false;
        if (Double.compare(that.width, width) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
            return false;
        if (progressDescript != null ? !progressDescript.equals(that.progressDescript) : that.progressDescript != null)
            return false;
        return stateDescript != null ? stateDescript.equals(that.stateDescript) : that.stateDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + imageRes;
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + position;
        result = 31 * result + (progress != +0.0f ? Float.floatToIntBits(progress) : 0);
        result = 31 * result + (progressDescript != null ? progressDescript.hashCode() : 0);
        result = 31 * result + (isSuccess ? 1 : 0);
        result = 31 * result + state;
        result = 31 * result + (stateDescript != null ? stateDescript.hashCode() : 0);
        result = 31 * result + type;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    public SimpleUIBean setTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    @Override
    public CharSequence getContent() {
        return content;
    }

    public SimpleUIBean setContent(CharSequence content) {
        this.content = content;
        return this;
    }

    @Override
    public Number getNumber() {
        return number;
    }

    public SimpleUIBean setNumber(Number number) {
        this.number = number;
        return this;
    }

    @Override
    public int getImageRes() {
        return imageRes;
    }

    public SimpleUIBean setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return this;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    public SimpleUIBean setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Override
    public double getX() {
        return x;
    }

    public SimpleUIBean setX(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double getY() {
        return y;
    }

    public SimpleUIBean setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public double getZ() {
        return z;
    }

    public SimpleUIBean setZ(double z) {
        this.z = z;
        return this;
    }

    @Override
    public int getPosition() {
        return position;
    }

    public SimpleUIBean setPosition(int position) {
        this.position = position;
        return this;
    }

    @Override
    public float getProgress() {
        return progress;
    }

    public SimpleUIBean setProgress(float progress) {
        this.progress = progress;
        return this;
    }

    @Override
    public CharSequence getProgressDescript() {
        return progressDescript;
    }

    public SimpleUIBean setProgressDescript(CharSequence progressDescript) {
        this.progressDescript = progressDescript;
        return this;
    }

    @Override
    public boolean isSuccess() {
        return isSuccess;
    }

    public SimpleUIBean setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    @Override
    public int getState() {
        return state;
    }

    public SimpleUIBean setState(int state) {
        this.state = state;
        return this;
    }

    @Override
    public CharSequence getStateDescript() {
        return stateDescript;
    }

    public SimpleUIBean setStateDescript(CharSequence stateDescript) {
        this.stateDescript = stateDescript;
        return this;
    }

    @Override
    public int getType() {
        return type;
    }

    public SimpleUIBean setType(int type) {
        this.type = type;
        return this;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public SimpleUIBean setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public SimpleUIBean setHeight(double height) {
        this.height = height;
        return this;
    }

    public SimpleUIBean setUniverseCallback(UniverseCallback universeCallback) {
        this.universeCallback = universeCallback;
        return this;
    }

    @Override
    public void onCallback(Object... objects) {
        if (universeCallback != null)   universeCallback.onCallback();
    }

    public SimpleUIBean setOn(boolean isOn){
        return setState(isOn?1:0);
    }

    @Override
    public SimpleUIBean setId(int id) {
        return (SimpleUIBean) super.setId(id);
    }

    @Override
    public SimpleUIBean setTag(Object tag) {
        return (SimpleUIBean) super.setTag(tag);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if (title instanceof Parcelable)
            dest.writeParcelable((Parcelable) title, flags);
        else    if (title instanceof Serializable)
            dest.writeSerializable((Serializable) title);
        else
            dest.writeString(title == null?null:title.toString());
        if (content instanceof Parcelable)
            dest.writeParcelable((Parcelable) content, flags);
        else    if (content instanceof Serializable)
            dest.writeSerializable((Serializable) content);
        else
            dest.writeString(content == null?null:content.toString());
        dest.writeSerializable(this.number);
        dest.writeInt(this.imageRes);
        dest.writeString(this.imageUrl);
        dest.writeDouble(this.x);
        dest.writeDouble(this.y);
        dest.writeDouble(this.z);
        dest.writeInt(this.position);
        dest.writeFloat(this.progress);
        if (progressDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) progressDescript, flags);
        else    if (progressDescript instanceof Serializable)
            dest.writeSerializable((Serializable) progressDescript);
        else
            dest.writeString(progressDescript == null?null:progressDescript.toString());
        dest.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        dest.writeInt(this.state);
        if (stateDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) stateDescript, flags);
        else    if (stateDescript instanceof Serializable)
            dest.writeSerializable((Serializable) stateDescript);
        else
            dest.writeString(stateDescript == null?null:stateDescript.toString());
        dest.writeInt(this.type);
        dest.writeDouble(this.width);
        dest.writeDouble(this.height);
    }

    protected SimpleUIBean(Parcel in) {
        super(in);
        if (title instanceof Parcelable)
            this.title = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (title instanceof Serializable)
            this.title = (CharSequence) in.readSerializable();
        else
            this.title = in.readString();
        if (content instanceof Parcelable)
            this.content = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (content instanceof Serializable)
            this.content = (CharSequence) in.readSerializable();
        else
            this.content = in.readString();
        this.number = (Number) in.readSerializable();
        this.imageRes = in.readInt();
        this.imageUrl = in.readString();
        this.x = in.readDouble();
        this.y = in.readDouble();
        this.z = in.readDouble();
        this.position = in.readInt();
        this.progress = in.readFloat();
        if (progressDescript instanceof Parcelable)
            this.progressDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (progressDescript instanceof Serializable)
            this.progressDescript = (CharSequence) in.readSerializable();
        else
            this.progressDescript = in.readString();
        this.isSuccess = in.readByte() != 0;
        this.state = in.readInt();
        if (stateDescript instanceof Parcelable)
            this.stateDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (stateDescript instanceof Serializable)
            this.stateDescript = (CharSequence) in.readSerializable();
        else
            this.stateDescript = in.readString();
        this.type = in.readInt();
        this.width = in.readDouble();
        this.height = in.readDouble();
    }

    public static final Creator<SimpleUIBean> CREATOR = new Creator<SimpleUIBean>() {
        @Override
        public SimpleUIBean createFromParcel(Parcel source) {
            return new SimpleUIBean(source);
        }

        @Override
        public SimpleUIBean[] newArray(int size) {
            return new SimpleUIBean[size];
        }
    };
}
