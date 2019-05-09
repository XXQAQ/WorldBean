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

    //对进度值的描述
    default CharSequence getProgressDescript(){
        return null;
    }

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getProgressRole() {
        return null;
    }

}
