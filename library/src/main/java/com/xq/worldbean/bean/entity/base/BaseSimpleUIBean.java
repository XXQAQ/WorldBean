package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.SimpleUIBehavior;
import com.xq.worldbean.util.callback.SimpleUICallback;
import java.io.Serializable;

public class BaseSimpleUIBean<T extends BaseSimpleUIBean> extends BaseBean<T> implements SimpleUIBehavior<T> {

    protected int newPrompt;
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
    protected CharSequence fractionDescriptor;
    protected boolean isSuccess;
    protected int state;
    protected CharSequence stateDescriptor;
    protected int type;
    protected CharSequence typeDescriptor;
    protected double width;
    protected double height;
    protected double size;
    protected int code;
    protected CharSequence codeDescriptor;
    protected int level;
    protected CharSequence levelDescriptor;
    protected SimpleUICallback simpleUICallback;

    public BaseSimpleUIBean() {

    }

    @Override
    public String toString() {
        return "BaseSimpleUIBean{" +
                "newPrompt=" + newPrompt +
                ", title=" + title +
                ", content=" + content +
                ", number=" + number +
                ", imageRes=" + imageRes +
                ", imageUrl='" + imageUrl + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", position=" + position +
                ", fraction=" + fraction +
                ", fractionDescriptor=" + fractionDescriptor +
                ", isSuccess=" + isSuccess +
                ", state=" + state +
                ", stateDescriptor=" + stateDescriptor +
                ", type=" + type +
                ", typeDescriptor=" + typeDescriptor +
                ", width=" + width +
                ", height=" + height +
                ", size=" + size +
                ", code=" + code +
                ", codeDescriptor=" + codeDescriptor +
                ", level=" + level +
                ", levelDescriptor=" + levelDescriptor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseSimpleUIBean that = (BaseSimpleUIBean) o;

        if (newPrompt != that.newPrompt) return false;
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
        if (Double.compare(that.size, size) != 0) return false;
        if (code != that.code) return false;
        if (level != that.level) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
            return false;
        if (fractionDescriptor != null ? !fractionDescriptor.equals(that.fractionDescriptor) : that.fractionDescriptor != null)
            return false;
        if (stateDescriptor != null ? !stateDescriptor.equals(that.stateDescriptor) : that.stateDescriptor != null)
            return false;
        if (typeDescriptor != null ? !typeDescriptor.equals(that.typeDescriptor) : that.typeDescriptor != null)
            return false;
        if (codeDescriptor != null ? !codeDescriptor.equals(that.codeDescriptor) : that.codeDescriptor != null)
            return false;
        return levelDescriptor != null ? levelDescriptor.equals(that.levelDescriptor) : that.levelDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + newPrompt;
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
        result = 31 * result + (fractionDescriptor != null ? fractionDescriptor.hashCode() : 0);
        result = 31 * result + (isSuccess ? 1 : 0);
        result = 31 * result + state;
        result = 31 * result + (stateDescriptor != null ? stateDescriptor.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (typeDescriptor != null ? typeDescriptor.hashCode() : 0);
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + code;
        result = 31 * result + (codeDescriptor != null ? codeDescriptor.hashCode() : 0);
        result = 31 * result + level;
        result = 31 * result + (levelDescriptor != null ? levelDescriptor.hashCode() : 0);
        return result;
    }

    @Override
    public int getNewPrompt() {
        return newPrompt;
    }

    @Override
    public T setNewPrompt(int newPrompt) {
        this.newPrompt = newPrompt;
        return (T) this;
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
    public CharSequence getFractionDescriptor() {
        return fractionDescriptor;
    }

    @Override
    public T setFractionDescriptor(CharSequence fractionDescriptor) {
        this.fractionDescriptor = fractionDescriptor;
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
    public CharSequence getStateDescriptor() {
        return stateDescriptor;
    }

    @Override
    public T setStateDescriptor(CharSequence stateDescriptor) {
        this.stateDescriptor = stateDescriptor;
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
    public CharSequence getTypeDescriptor() {
        return typeDescriptor;
    }

    @Override
    public T setTypeDescriptor(CharSequence typeDescriptor) {
        this.typeDescriptor = typeDescriptor;
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
    public double getSize() {
        return size;
    }

    @Override
    public T setSize(double size) {
        this.size = size;
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
    public CharSequence getCodeDescriptor() {
        return codeDescriptor;
    }

    @Override
    public T setCodeDescriptor(CharSequence codeDescriptor) {
        this.codeDescriptor = codeDescriptor;
        return (T) this;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public T setLevel(int level) {
        this.level = level;
        return (T) this;
    }

    @Override
    public CharSequence getLevelDescriptor() {
        return levelDescriptor;
    }

    @Override
    public T setLevelDescriptor(CharSequence levelDescriptor) {
        this.levelDescriptor = levelDescriptor;
        return (T) this;
    }

    @Override
    public boolean isOn() {
        return getState() > 0;
    }

    @Override
    public T setOn(boolean isOn){
        return setState(isOn?1:0);
    }

    @Override
    public T setSimpleUICallback(SimpleUICallback simpleUICallback) {
        this.simpleUICallback = simpleUICallback;
        return (T) this;
    }

    @Deprecated
    @Override
    public void onCallback(SimpleUIBehavior behavior) {
        if (simpleUICallback != null)   simpleUICallback.onCallback(behavior);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(newPrompt);
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
        if (fractionDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) fractionDescriptor, flags);
        else    if (fractionDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) fractionDescriptor);
        else
            dest.writeString(fractionDescriptor == null?null: fractionDescriptor.toString());
        dest.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        dest.writeInt(this.state);
        if (stateDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) stateDescriptor, flags);
        else    if (stateDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) stateDescriptor);
        else
            dest.writeString(stateDescriptor == null?null:stateDescriptor.toString());
        dest.writeInt(this.type);
        if (typeDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) typeDescriptor, flags);
        else    if (typeDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) typeDescriptor);
        else
            dest.writeString(typeDescriptor == null?null:typeDescriptor.toString());
        dest.writeDouble(this.width);
        dest.writeDouble(this.height);
        dest.writeDouble(this.size);
        dest.writeInt(this.code);
        if (codeDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) codeDescriptor, flags);
        else    if (codeDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) codeDescriptor);
        else
            dest.writeString(codeDescriptor == null?null:codeDescriptor.toString());
        dest.writeInt(this.level);
        if (levelDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) levelDescriptor, flags);
        else    if (levelDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) levelDescriptor);
        else
            dest.writeString(levelDescriptor == null?null:levelDescriptor.toString());
    }

    protected BaseSimpleUIBean(Parcel in) {
        super(in);
        this.newPrompt = in.readInt();
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
        if (fractionDescriptor instanceof Parcelable)
            this.fractionDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (fractionDescriptor instanceof Serializable)
            this.fractionDescriptor = (CharSequence) in.readSerializable();
        else
            this.fractionDescriptor = in.readString();
        this.isSuccess = in.readByte() != 0;
        this.state = in.readInt();
        if (stateDescriptor instanceof Parcelable)
            this.stateDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (stateDescriptor instanceof Serializable)
            this.stateDescriptor = (CharSequence) in.readSerializable();
        else
            this.stateDescriptor = in.readString();
        this.type = in.readInt();
        if (typeDescriptor instanceof Parcelable)
            this.typeDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (typeDescriptor instanceof Serializable)
            this.typeDescriptor = (CharSequence) in.readSerializable();
        else
            this.typeDescriptor = in.readString();
        this.width = in.readDouble();
        this.height = in.readDouble();
        this.size = in.readDouble();
        this.code = in.readInt();
        if (codeDescriptor instanceof Parcelable)
            this.codeDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (codeDescriptor instanceof Serializable)
            this.codeDescriptor = (CharSequence) in.readSerializable();
        else
            this.codeDescriptor = in.readString();
        this.level = in.readInt();
        if (levelDescriptor instanceof Parcelable)
            this.levelDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (levelDescriptor instanceof Serializable)
            this.levelDescriptor = (CharSequence) in.readSerializable();
        else
            this.levelDescriptor = in.readString();
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
