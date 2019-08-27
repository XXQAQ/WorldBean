package com.xq.worldbean.bean.entity;

import android.graphics.drawable.Drawable;
import com.xq.worldbean.bean.entity.base.BaseImageBean;

public class ImageBean extends BaseImageBean {
    public ImageBean() {
    }

    public ImageBean(int imageRes) {
        super(imageRes);
    }

    public ImageBean(Drawable imageDrawable) {
        super(imageDrawable);
    }

    public ImageBean(String imageUrl) {
        super(imageUrl);
    }
}
