package com.xq.worldbean.bean.entity.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.LevelBehavior;
import java.io.Serializable;

public class BaseLevel<T extends BaseLevel> extends BaseBean<T> implements LevelBehavior<T> {

    protected int level;
    protected CharSequence levelDescript;

    public BaseLevel() {
    }

    public BaseLevel(int level) {
        this.level = level;
    }

    public BaseLevel(int level, CharSequence levelDescript) {
        this.level = level;
        this.levelDescript = levelDescript;
    }

    public BaseLevel(int id, int level) {
        super(id);
        this.level = level;
    }

    public BaseLevel(int id, int level, CharSequence levelDescript) {
        super(id);
        this.level = level;
        this.levelDescript = levelDescript;
    }

    @Override
    public String toString() {
        return "BaseLevel{" +
                "level=" + level +
                ", levelDescript=" + levelDescript +
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

        BaseLevel that = (BaseLevel) o;

        if (level != that.level) return false;
        return levelDescript != null ? levelDescript.equals(that.levelDescript) : that.levelDescript == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + level;
        result = 31 * result + (levelDescript != null ? levelDescript.hashCode() : 0);
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
    public CharSequence getLevelDescript() {
        return levelDescript;
    }

    @Override
    public T setLevelDescript(CharSequence levelDescript) {
        this.levelDescript = levelDescript;
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
        if (levelDescript instanceof Parcelable)
            dest.writeParcelable((Parcelable) levelDescript, flags);
        else    if (levelDescript instanceof Serializable)
            dest.writeSerializable((Serializable) levelDescript);
        else
            dest.writeString(levelDescript == null?null:levelDescript.toString());
    }

    protected BaseLevel(Parcel in) {
        super(in);
        this.level = in.readInt();
        if (levelDescript instanceof Parcelable)
            this.levelDescript = in.readParcelable(CharSequence.class.getClassLoader());
        else    if (levelDescript instanceof Serializable)
            this.levelDescript = (CharSequence) in.readSerializable();
        else
            this.levelDescript = in.readString();
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
