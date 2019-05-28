package com.xq.worldbean.bean.behavior;

import com.xq.worldbean.util.callback.SimpleUICallback;
import java.util.List;

public interface SimpleUIBehavior<T extends SimpleUIBehavior> extends NewPromptBehavior<T>,TitleBehavior<T>,ContentBehavior<T>,NumberBehavior<T>,ImageBehavior<T>,ListBehavior<T>,CoordinateBehavior<T>,PositionBehavior<T>,FractionBehavior<T>,SuccessBehavior<T>,SwitchStateBehavior<T>,TypeBehavior<T>,SizeBehavior<T>,CodeBehavior<T>,LevelBehavior<T>,SimpleUICallback {

    @Override
    default int getNewPrompt() {
        return 0;
    }

    @Override
    default T setNewPrompt(int newPrompt) {
        return (T) this;
    }

    @Override
    default CharSequence getContent() {
        return null;
    }

    @Override
    default Number getNumber() {
        return null;
    }

    @Override
    default List getList() {
        return null;
    }

    @Override
    default double getX() {
        return 0;
    }

    @Override
    default double getY() {
        return 0;
    }

    @Override
    default double getZ() {
        return 0;
    }

    @Override
    default int getPosition() {
        return 0;
    }

    @Override
    default float getFraction() {
        return 0;
    }

    @Override
    default boolean isSuccess() {
        return false;
    }

    @Override
    default int getState() {
        return 0;
    }

    @Override
    default int getType() {
        return 0;
    }

    @Override
    default double getWidth() {
        return 0;
    }

    @Override
    default double getHeight() {
        return 0;
    }

    @Override
    default int getCode() {
        return 0;
    }

    @Override
    default int getLevel() {
        return 0;
    }

    default T setSimpleUICallback(SimpleUICallback simpleUICallback) {
        return (T) this;
    }

    default void onCallback() {
        onCallback(this);
    }

    @Deprecated
    @Override
    default void onCallback(SimpleUIBehavior behavior) {

    }
}
