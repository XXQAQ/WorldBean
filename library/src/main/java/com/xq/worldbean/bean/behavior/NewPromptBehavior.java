package com.xq.worldbean.bean.behavior;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public interface NewPromptBehavior<T extends NewPromptBehavior> extends Serializable, Parcelable {

    @Override
    default int describeContents() {
        return 0;
    }

    @Override
    default void writeToParcel(Parcel dest, int flags) {

    }

    public int getNewPrompt();

    public T setNewPrompt(int newPrompt);

}
