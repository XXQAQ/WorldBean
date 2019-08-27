package com.xq.worldbean.util;

public interface Converter<T1,T2> {

    public T2 convert(T1 t);

}
