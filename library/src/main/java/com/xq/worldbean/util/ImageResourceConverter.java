package com.xq.worldbean.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import java.lang.reflect.InvocationTargetException;

public class ImageResourceConverter implements Converter<Integer, Drawable> {

    static Application app = getApplicationByReflect();

    private static ImageResourceConverter converter;

    public synchronized static ImageResourceConverter getInstance(){
        if (converter == null)  converter = new ImageResourceConverter();
        return converter;
    }

    public synchronized static void setInstance(ImageResourceConverter converter){
        ImageResourceConverter.converter = converter;
    }

    @Override
    public Drawable convert(Integer imageRes) {
        if (imageRes == null || imageRes == 0)    return null;
        return ContextCompat.getDrawable(app,imageRes);
    }

    private static Application getApplicationByReflect() {
        try {
            @SuppressLint("PrivateApi")
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Object thread = activityThread.getMethod("currentActivityThread").invoke(null);
            Object app = activityThread.getMethod("getApplication").invoke(thread);
            if (app == null) {
                throw new NullPointerException("u should init first");
            }
            return (Application) app;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("u should init first");
    }

}
