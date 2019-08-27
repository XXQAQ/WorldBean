package com.xq.worldbean.bean.behavior;


import android.graphics.drawable.Drawable;

import com.xq.worldbean.util.ImageResourceConverter;

public interface ImageBehavior extends BaseBehavior {

    public Drawable getImageDrawable();

    default Drawable getImageDrawable(String role) {
        return getImageDrawable();
    }

    default void setImageDrawable(Drawable imageDrawable){
    }

    default void setImageDrawable(Drawable imageDrawable,String role){
        setImageDrawable(imageDrawable);
    }

    default void setImageRes(int imageRes){
        setImageDrawable(ImageResourceConverter.getInstance().convert(imageRes));
    }

    default void setImageRes(int imageRes,String role){
        setImageDrawable(ImageResourceConverter.getInstance().convert(imageRes),role);
    }

    public String getImageUrl();

    default String getImageUrl(String role) {
        return getImageUrl();
    }

    default void setImageUrl(String imageUrl){
    }

    default void setImageUrl(String imageUrl,String role){
        setImageUrl(imageUrl);
    }

}
