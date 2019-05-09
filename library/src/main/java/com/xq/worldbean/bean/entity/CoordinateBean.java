package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseCoordinateBean;

public class CoordinateBean extends BaseCoordinateBean<CoordinateBean> {
    public CoordinateBean() {
    }

    public CoordinateBean(double x, double y, double z) {
        super(x, y, z);
    }

    public CoordinateBean(int id, double x, double y, double z) {
        super(id, x, y, z);
    }
}
