package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.SimpleUIBehavior;
import com.xq.worldbean.util.callback.UniverseCallback;
import java.io.Serializable;

public class BaseSimpleUIBean<T extends BaseSimpleUIBean> extends BaseBean<T> implements SimpleUIBehavior<T> {

    protected CharSequence title;
    protected CharSequence content;
    protected Number number;
    protected int imageRes;
    protected String imageUrl;
    protected double x;
    protected double y;
    protected double z;
    protected int position;
    protected float fraction;
    protected CharSequence fractionDescript;
    protected boolean isSuccess;
    protected int state;
    protected CharSequence stateDescript;
    protected int type;
    protected double width;
    protected double height;
    protected int code;
    protected UniverseCallback universeCallback;

    public BaseSimpleUIBean() {

    }

    @Override
    public String toString() {
        return "BaseSimpleUIBean{" +
                "title=" + title +
                ", content=" + content +
                ", number=" + number +
                ", imageRes=" + imageRes +
                ", imageUrl='" + imageUrl + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", position=" + position +
                ", fraction=" + fraction +
                ", fractionDescript=" + fractionDescript +
                ", isSuccess=" + isSuccess +
                ", state=" + state +
                ", stateDescript=" + stateDescript +
                ", type=" + type +
                ", width=" + width +
                ", height=" + height +
                ", code=" + code +
                ", tag=" + tag +
                ", id=" + id +
                ", primaryId=" + primaryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseSimpleUIBean that = (BaseSimpleUIBean) o;

        if (imageRes != that.imageRes) return false;
        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        if (Double.compare(that.z, z) != 0) return false;
        if (position != that.position) return false;
        if (Float.compare(that.fraction, fraction) != 0) return false;
        if (isSuccess != that.isSuccess) return false;
        if (state != that.state) return false;
        if (type != that.type) return false;
        if (Double.compare(that.width, width) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        if (code != that.code) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
            return false;
        if (fractionDescript != null ? !fractionDescript.equals(that.fractionDescript) : that.fractionDescript != null)
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
        result = 31 * result + (fraction != +0.0f ? Float.floatToIntBits(fraction) : 0);
        result = 31 * result + (fractionDescript != null ? fractionDescript.hashCode() : 0);
        result = 31 * result + (isSuccess ? 1 : 0);
        result = 31 * result + state;
        result = 31 * result + (stateDescript != null ? stateDescript.hashCode() : 0);
        result = 31 * result + type;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + code;
        return result;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    @Override
    public T setTitle(CharSequence title) {
        this.title = title;
        return (T) this;
    }

    @Override
    public CharSequence getContent() {
        return content;
    }

    @Override
    public T setContent(CharSequence content) {
        this.content = content;
        return (T) this;
    }

    @Override
    public Number getNumber() {
        return number;
    }

    @Override
    public T setNumber(Number number) {
        this.number = number;
        return (T) this;
    }

    @Override
    public int getImageRes() {
        return imageRes;
    }

    @Override
    public T setImageRes(int imageRes) {
        this.imageRes = imageRes;
        return (T) this;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public T setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return (T) this;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public T setX(double x) {
        this.x = x;
        return (T) this;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public T setY(double y) {
        this.y = y;
        return (T) this;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public T setZ(double z) {
        this.z = z;
        return (T) this;
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
    public float getFraction() {
        return fraction;
    }

    @Override
    public T setFraction(float fraction) {
        this.fraction = fraction;
        return (T) this;
    }

    @Override
    public CharSequence getFractionDescript() {
        return fractionDescript;
    }

    @Override
    public T setFractionDescript(CharSequence fractionDescript) {
        this.fractionDescript = fractionDescript;
        return (T) this;
    }

    @Override
    public boolean isSuccess() {
        return isSuccess;
    }

    @Override
    public T setSuccess(boolean success) {
        isSuccess = success;
        return (T) this;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public T setState(int state) {
        this.state = state;
        return (T) this;
    }

    @Override
    public CharSequence getStateDescript() {
        return stateDescript;
    }

    @Override
    public T setStateDescript(CharSequence stateDescript) {
        this.stateDescript = stateDescript;
        return (T) this;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public T setType(int type) {
        this.type = type;
        return (T) this;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public T setWidth(double width) {
        this.width = width;
        return (T) this;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public T setHeight(double height) {
        this.height = height;
        return (T) this;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public T setCode(int code) {
        this.code = code;
        return (T) this;
    }

    @Override
    public T setOn(boolean isOn){
        return setState(isOn?1:0);
    }

    public T setUniverseCallback(UniverseCallback universeCallback) {
        this.universeCallback = universeCallback;
        return (T) this;
    }

    @Override
    public void onCallback(Object... objects) {
        if (universeCallback != null)   universeCallback.onCallback();
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
        dest.writeFloat(this.fraction);
        if (fractionDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) fractionDescript, flags);
        else    if (fractionDescript instanceof Serializable)
            dest.writeSerializable((Serializable) fractionDescript);
        else
            dest.writeString(fractionDescript == null?null: fractionDescript.toString());
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
        dest.writeInt(this.code);
    }

    protected BaseSimpleUIBean(Parcel in) {
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
        this.fraction = in.readFloat();
        if (fractionDescript instanceof Parcelable)
            this.fractionDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (fractionDescript instanceof Serializable)
            this.fractionDescript = (CharSequence) in.readSerializable();
        else
            this.fractionDescript = in.readString();
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
        this.code = in.readInt();
    }

    public static final Creator<BaseSimpleUIBean> CREATOR = new Creator<BaseSimpleUIBean>() {
        @Override
        public BaseSimpleUIBean createFromParcel(Parcel source) {
            return new BaseSimpleUIBean(source);
        }

        @Override
        public BaseSimpleUIBean[] newArray(int size) {
            return new BaseSimpleUIBean[size];
        }
    };
}
