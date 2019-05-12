package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface FractionBehavior<T extends FractionBehavior> extends BaseBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public float getFraction();

    default float getFraction(String role) {
        return getFraction();
    }

    default T setFraction(float fraction){
        return (T)this;
    }

    default T setFraction(float fraction,String role){
        return setFraction(fraction);
    }

    //对进度值的描述
    default CharSequence getFractionDescript(){
        return null;
    }

    default CharSequence getFractionDescript(String role){
        return getFractionDescript();
    }

    default T setFractionDescript(CharSequence descript){
        return (T)this;
    }

    default T setFractionDescript(CharSequence descript,String role){
        return setFractionDescript(descript);
    }

}
