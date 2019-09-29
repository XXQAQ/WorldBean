package com.xq.worldbean.util;

public interface Converter3<T1,T2,T3,R> {

    public R convert(T1 t1, T2 t2,T3 t3);

}
