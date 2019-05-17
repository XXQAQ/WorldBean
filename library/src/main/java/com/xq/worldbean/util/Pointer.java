package com.xq.worldbean.util;

import java.io.Serializable;

public class Pointer<T> implements Serializable {

    public T t;

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

    public Pointer set(T t){
        this.t = t;
        return this;
    }

}
