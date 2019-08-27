package com.xq.worldbean.bean.entity.base;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import com.xq.worldbean.bean.behavior.WorldBehavior;
import java.io.Serializable;
import java.util.List;

public class BaseWorldBean extends BaseBean implements WorldBehavior {

    protected int newPrompt;
    protected CharSequence title;
    protected CharSequence content;
    protected Number number;
    protected Drawable imageDrawable;
    protected String imageUrl;
    protected List list;
    protected String link;
    protected double x;
    protected double y;
    protected double z;
    protected int position;
    protected int startPosition;
    protected int endPosition;
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

    public BaseWorldBean() {

    }

    @Override
    public String toString() {
        return "BaseWorldBean{" +
                "newPrompt=" + newPrompt +
                ", title=" + title +
                ", content=" + content +
                ", number=" + number +
                ", imageDrawable=" + imageDrawable +
                ", imageUrl='" + imageUrl + '\'' +
                ", list=" + list +
                ", link='" + link + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", position=" + position +
                ", startPosition=" + startPosition +
                ", endPosition=" + endPosition +
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

        BaseWorldBean that = (BaseWorldBean) o;

        if (newPrompt != that.newPrompt) return false;
        if (imageDrawable != null ? !imageDrawable.equals(that.imageDrawable) : that.imageDrawable != null) return false;
        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        if (Double.compare(that.z, z) != 0) return false;
        if (position != that.position) return false;
        if (startPosition != that.startPosition) return false;
        if (endPosition != that.endPosition) return false;
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
        if (list != null ? !list.equals(that.list) : that.list != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
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
        result = 31 * result + (imageDrawable != null ? imageDrawable.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (list != null ? list.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + position;
        result = 31 * result + startPosition;
        result = 31 * result + endPosition;
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
    public void setNewPrompt(int newPrompt) {
        this.newPrompt = newPrompt;
    }

    @Override
    public CharSequence getTitle() {
        return title;
    }

    @Override
    public void setTitle(CharSequence title) {
        this.title = title;
    }

    @Override
    public CharSequence getContent() {
        return content;
    }

    @Override
    public void setContent(CharSequence content) {
        this.content = content;
    }

    @Override
    public Number getNumber() {
        return number;
    }

    @Override
    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public Drawable getImageDrawable() {
        return imageDrawable;
    }

    @Override
    public void setImageDrawable(Drawable imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public List getList() {
        return list;
    }

    @Override
    public void setList(List list) {
        this.list = list;
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
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int getStartPosition() {
        return startPosition;
    }

    @Override
    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    @Override
    public int getEndPosition() {
        return endPosition;
    }

    @Override
    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }

    @Override
    public float getFraction() {
        return fraction;
    }

    @Override
    public void setFraction(float fraction) {
        this.fraction = fraction;
    }

    @Override
    public CharSequence getFractionDescriptor() {
        return fractionDescriptor;
    }

    @Override
    public void setFractionDescriptor(CharSequence fractionDescriptor) {
        this.fractionDescriptor = fractionDescriptor;
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
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public CharSequence getStateDescriptor() {
        return stateDescriptor;
    }

    @Override
    public void setStateDescriptor(CharSequence stateDescriptor) {
        this.stateDescriptor = stateDescriptor;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public CharSequence getTypeDescriptor() {
        return typeDescriptor;
    }

    @Override
    public void setTypeDescriptor(CharSequence typeDescriptor) {
        this.typeDescriptor = typeDescriptor;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public CharSequence getCodeDescriptor() {
        return codeDescriptor;
    }

    @Override
    public void setCodeDescriptor(CharSequence codeDescriptor) {
        this.codeDescriptor = codeDescriptor;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public CharSequence getLevelDescriptor() {
        return levelDescriptor;
    }

    @Override
    public void setLevelDescriptor(CharSequence levelDescriptor) {
        this.levelDescriptor = levelDescriptor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(newPrompt);
        writeObject(dest,flags,title);
        writeObject(dest,flags,content);
        dest.writeSerializable(this.number);
        dest.writeString(this.imageUrl);
        writeDrawable(dest,imageDrawable);
        dest.writeSerializable((Serializable) list);
        dest.writeString(this.link);
        dest.writeDouble(this.x);
        dest.writeDouble(this.y);
        dest.writeDouble(this.z);
        dest.writeInt(this.position);
        dest.writeInt(this.startPosition);
        dest.writeInt(this.endPosition);
        dest.writeFloat(this.fraction);
        writeObject(dest,flags,fractionDescriptor);
        dest.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        dest.writeInt(this.state);
        writeObject(dest,flags,stateDescriptor);
        dest.writeInt(this.type);
        writeObject(dest,flags,typeDescriptor);
        dest.writeDouble(this.width);
        dest.writeDouble(this.height);
        dest.writeDouble(this.size);
        dest.writeInt(this.code);
        writeObject(dest,flags,codeDescriptor);
        dest.writeInt(this.level);
        writeObject(dest,flags,levelDescriptor);
    }

    protected BaseWorldBean(Parcel in) {
        super(in);
        this.newPrompt = in.readInt();
        this.title = (CharSequence) readObject(in);
        this.content = (CharSequence) readObject(in);
        this.number = (Number) in.readSerializable();
        this.imageUrl = in.readString();
        this.imageDrawable = readDrawable(in);
        this.list = (List) in.readSerializable();
        this.link = in.readString();
        this.x = in.readDouble();
        this.y = in.readDouble();
        this.z = in.readDouble();
        this.position = in.readInt();
        this.startPosition = in.readInt();
        this.endPosition = in.readInt();
        this.fraction = in.readFloat();
        this.fractionDescriptor = (CharSequence) readObject(in);
        this.isSuccess = in.readByte() != 0;
        this.state = in.readInt();
        this.stateDescriptor = (CharSequence) readObject(in);
        this.type = in.readInt();
        this.typeDescriptor = (CharSequence) readObject(in);
        this.width = in.readDouble();
        this.height = in.readDouble();
        this.size = in.readDouble();
        this.code = in.readInt();
        this.codeDescriptor = (CharSequence) readObject(in);
        this.level = in.readInt();
        this.levelDescriptor = (CharSequence) readObject(in);
    }

    public static final Creator<BaseWorldBean> CREATOR = new Creator<BaseWorldBean>() {
        @Override
        public BaseWorldBean createFromParcel(Parcel source) {
            return new BaseWorldBean(source);
        }

        @Override
        public BaseWorldBean[] newArray(int size) {
            return new BaseWorldBean[size];
        }
    };
}
