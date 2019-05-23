package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.LevelBehavior;
import java.io.Serializable;

public class BaseLevel<T extends BaseLevel> extends BaseBean<T> implements LevelBehavior<T> {

    protected int level;
    protected CharSequence levelDescriptor;

    public BaseLevel() {
    }

    public BaseLevel(int level) {
        this.level = level;
    }

    public BaseLevel(int level, CharSequence levelDescriptor) {
        this.level = level;
        this.levelDescriptor = levelDescriptor;
    }

    @Override
    public String toString() {
        return "BaseLevel{" +
                "level=" + level +
                ", levelDescriptor=" + levelDescriptor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BaseLevel that = (BaseLevel) o;

        if (level != that.level) return false;
        return levelDescriptor != null ? levelDescriptor.equals(that.levelDescriptor) : that.levelDescriptor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + level;
        result = 31 * result + (levelDescriptor != null ? levelDescriptor.hashCode() : 0);
        return result;
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
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.level);
        if (levelDescriptor instanceof Parcelable)
            dest.writeParcelable((Parcelable) levelDescriptor, flags);
        else    if (levelDescriptor instanceof Serializable)
            dest.writeSerializable((Serializable) levelDescriptor);
        else
            dest.writeString(levelDescriptor == null?null:levelDescriptor.toString());
    }

    protected BaseLevel(Parcel in) {
        super(in);
        this.level = in.readInt();
        if (levelDescriptor instanceof Parcelable)
            this.levelDescriptor = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (levelDescriptor instanceof Serializable)
            this.levelDescriptor = (CharSequence) in.readSerializable();
        else
            this.levelDescriptor = in.readString();
    }

    public static final Creator<BaseLevel> CREATOR = new Creator<BaseLevel>() {
        @Override
        public BaseLevel createFromParcel(Parcel source) {
            return new BaseLevel(source);
        }

        @Override
        public BaseLevel[] newArray(int size) {
            return new BaseLevel[size];
        }
    };
}
