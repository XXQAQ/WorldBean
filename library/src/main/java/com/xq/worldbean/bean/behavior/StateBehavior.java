package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface StateBehavior extends ParentBehavior{

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default int getId() {
        return 0;
    }

    @Override
    default Object getTag() {
        return null;
    }

    public int getState();

    //对状态的描述
    default CharSequence getStateDescript(){
        return null;
    }

    //上述内容在属性值中扮演的角色，不需要处理判断逻辑可直接返回null
    public String getStateRole();

}
