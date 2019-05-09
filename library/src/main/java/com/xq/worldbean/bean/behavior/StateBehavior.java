package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface StateBehavior extends BaseBehavior {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getState();

    default int getState(String role) {
        return getState();
    }

    //对状态的描述
    default CharSequence getStateDescript(){
        return null;
    }

    default CharSequence getStateDescript(String role){
        return getStateDescript();
    }

}
