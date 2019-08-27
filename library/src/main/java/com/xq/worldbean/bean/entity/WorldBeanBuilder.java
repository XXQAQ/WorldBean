package com.xq.worldbean.bean.entity;

import android.graphics.drawable.Drawable;
import com.xq.worldbean.util.ImageResourceConverter;
import com.xq.worldbean.util.callback.TCallback;
import java.util.List;

public class WorldBeanBuilder{

    private WorldBean bean = new WorldBean();

    public WorldBean build(){
        return bean;
    }

    public WorldBeanBuilder setTag(Object tag) {
        bean.setTag(tag);
        return this;
    }

    public WorldBeanBuilder setId(String id) {
        bean.setId(id);
        return this;
    }

    public WorldBeanBuilder setForeignId(String foreignId) {
        bean.setForeignId(foreignId);
        return this;
    }

    public WorldBeanBuilder setCallback(TCallback callback) {
        bean.setCallback(callback);
        return this;
    }

    public WorldBeanBuilder setNewPrompt(int newPrompt) {
        bean.setNewPrompt(newPrompt);
        return this;
    }

    public WorldBeanBuilder setTitle(CharSequence title) {
        bean.setTitle(title);
        return this;
    }

    public WorldBeanBuilder setContent(CharSequence content) {
        bean.setContent(content);
        return this;
    }

    public WorldBeanBuilder setNumber(Number number) {
        bean.setNumber(number);
        return this;
    }

    public WorldBeanBuilder setImageRes(int imageRes) {
        setImageDrawable(ImageResourceConverter.getInstance().convert(imageRes));
        return this;
    }

    public WorldBeanBuilder setImageDrawable(Drawable imageDrawable) {
        bean.setImageDrawable(imageDrawable);
        return this;
    }

    public WorldBeanBuilder setImageUrl(String imageUrl) {
        bean.setImageUrl(imageUrl);
        return this;
    }

    public WorldBeanBuilder setList(List list) {
        bean.setList(list);
        return this;
    }

    public WorldBeanBuilder setLink(String link) {
        bean.setLink(link);
        return this;
    }

    public WorldBeanBuilder setX(double x) {
        bean.setX(x);
        return this;
    }

    public WorldBeanBuilder setY(double y) {
        bean.setY(y);
        return this;
    }

    public WorldBeanBuilder setZ(double z) {
        bean.setZ(z);
        return this;
    }

    public WorldBeanBuilder setPosition(int position) {
        bean.setPosition(position);
        return this;
    }

    public WorldBeanBuilder setStartPosition(int startPosition) {
        bean.setStartPosition(startPosition);
        return this;
    }

    public WorldBeanBuilder setEndPosition(int endPosition) {
        bean.setEndPosition(endPosition);
        return this;
    }

    public WorldBeanBuilder setFraction(float fraction) {
        bean.setFraction(fraction);
        return this;
    }

    public WorldBeanBuilder setFractionDescriptor(CharSequence fractionDescriptor) {
        bean.setFractionDescriptor(fractionDescriptor);
        return this;
    }

    public WorldBeanBuilder setSuccess(boolean success) {
        bean.setSuccess(success);
        return this;
    }

    public WorldBeanBuilder setOn(boolean isOn){
        return setState(isOn?1:0);
    }

    public WorldBeanBuilder setState(int state) {
        bean.setState(state);
        return this;
    }

    public WorldBeanBuilder setStateDescriptor(CharSequence stateDescriptor) {
        bean.setStateDescriptor(stateDescriptor);
        return this;
    }

    public WorldBeanBuilder setType(int type) {
        bean.setType(type);
        return this;
    }

    public WorldBeanBuilder setTypeDescriptor(CharSequence typeDescriptor) {
        bean.setTypeDescriptor(typeDescriptor);
        return this;
    }

    public WorldBeanBuilder setWidth(double width) {
        bean.setWidth(width);
        return this;
    }

    public WorldBeanBuilder setHeight(double height) {
        bean.setHeight(height);
        return this;
    }

    public WorldBeanBuilder setSize(double size) {
        bean.setSize(size);
        return this;
    }

    public WorldBeanBuilder setCode(int code) {
        bean.setCode(code);
        return this;
    }

    public WorldBeanBuilder setCodeDescriptor(CharSequence codeDescriptor) {
        bean.setCodeDescriptor(codeDescriptor);
        return this;
    }

    public WorldBeanBuilder setLevel(int level) {
        bean.setLevel(level);
        return this;
    }

    public WorldBeanBuilder setLevelDescriptor(CharSequence levelDescriptor) {
        bean.setLevelDescriptor(levelDescriptor);
        return this;
    }
}

