package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ProgressBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    //进度范围 0 - 1.0
    public float getProgress();

    default float getProgress(String role) {
        return getProgress();
    }

    //对进度值的描述
    default CharSequence getProgressDescript(){
        return null;
    }

    default CharSequence getProgressDescript(String role){
        return getProgressDescript();
    }

}
