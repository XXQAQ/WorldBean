package com.xq.worldbean.bean.behavior;

import android.os.Parcel;

public interface BaseBehavior<T extends BaseBehavior> extends IdBehavior<T>,TagBehavior<T>,UnreadPromptBehavior<T> {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    default Object getTag() {
        return null;
    }

    @Override
    default int getId() {
        return 0;
    }

    @Override
    default int getUnreadPrompt() {
        return 0;
    }

    @Override
    default T setUnreadPrompt(int unreadPrompt) {
        return null;
    }

}
