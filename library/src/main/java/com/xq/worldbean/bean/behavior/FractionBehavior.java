package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface FractionBehavior extends BaseBehavior {

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

    //对进度值的描述
    default CharSequence getFractionDescript(){
        return null;
    }

    default CharSequence getFractionDescript(String role){
        return getFractionDescript();
    }

}
