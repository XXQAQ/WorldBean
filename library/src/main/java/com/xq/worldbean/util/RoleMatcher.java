package com.xq.worldbean.util;

public interface RoleMatcher<T> {

    public boolean isFirstMatch(T t);

    public boolean isSecondMatch(T t);

    public boolean isThirdMatch(T t);

}
