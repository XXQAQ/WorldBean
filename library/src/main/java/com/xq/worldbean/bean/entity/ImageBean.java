package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseImageBean;

public class ImageBean extends BaseImageBean<ImageBean> {
    public ImageBean() {
    }

    public ImageBean(int imageRes) {
        super(imageRes);
    }

    public ImageBean(String imageUrl) {
        super(imageUrl);
    }

    public ImageBean(int id, int imageRes) {
        super(id, imageRes);
    }

    public ImageBean(int id, String imageUrl) {
        super(id, imageUrl);
    }
}
