package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseFractionBean;

public class FractionBean extends BaseFractionBean {
    public FractionBean() {
    }

    public FractionBean(float fraction) {
        super(fraction);
    }

    public FractionBean(float fraction, CharSequence fractionDescriptor) {
        super(fraction, fractionDescriptor);
    }

    public FractionBean(String id, float fraction) {
        super(id, fraction);
    }

    public FractionBean(String id, float fraction, CharSequence fractionDescriptor) {
        super(id, fraction, fractionDescriptor);
    }
}
