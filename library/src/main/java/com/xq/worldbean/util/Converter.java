package com.xq.worldbean.util;

public interface Converter<T,R> {

    public R convert(T t);

}
