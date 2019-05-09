package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface ContentBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public CharSequence getContent();

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    default String getContentRole(){
        return null;
    }

}
