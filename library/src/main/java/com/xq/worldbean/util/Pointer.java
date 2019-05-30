package com.xq.worldbean.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Pointer<T> implements Serializable , Parcelable {

    private T t;

    public Pointer() {
    }

    @Override
    public String toString() {
        return "Pointer{" +
                "t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pointer that = (Pointer) o;

        return t != null ? t.equals(that.t) : that.t == null;
    }

    @Override
    public int hashCode() {
        return t != null ? t.hashCode() : 0;
    }

    public T get(){
        return t;
    }

    public Pointer<T> set(T t){
        this.t = t;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (t instanceof Parcelable)
            dest.writeParcelable((Parcelable) t, flags);
        else    if (t instanceof Serializable)
            dest.writeSerializable((Serializable) t);
    }

    protected Pointer(Parcel in) {
        if (t instanceof Parcelable)
            this.t = in.readParcelable(t.getClass().getClassLoader());
        else    if (t instanceof Serializable)
            this.t = (T) in.readSerializable();
    }

    public static final Creator<Pointer> CREATOR = new Creator<Pointer>() {
        @Override
        public Pointer createFromParcel(Parcel source) {
            return new Pointer(source);
        }

        @Override
        public Pointer[] newArray(int size) {
            return new Pointer[size];
        }
    };
}
