package com.xq.worldbean.bean.behavior;

import java.util.List;

public interface WorldBehavior extends NewPromptBehavior,TitleBehavior,ContentBehavior,NumberBehavior,ImageBehavior,ListBehavior, LinkBehavior,CoordinateBehavior,PositionBehavior,FractionBehavior,SuccessBehavior,SwitchStateBehavior,TypeBehavior,SizeBehavior,CodeBehavior,LevelBehavior{

    @Override
    default int getNewPrompt() {
        return 0;
    }

    @Override
    default void setNewPrompt(int newPrompt) {

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
    default List<?> getList() {
        return null;
    }

    @Override
    default String getLink() {
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
    default double getSize() {
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

}
