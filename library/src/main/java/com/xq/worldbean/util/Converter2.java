package com.xq.worldbean.util;

public interface Converter2<T1,T2,R> {

    public R convert(T1 t1,T2 t2);

}
