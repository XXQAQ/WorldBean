package com.xq.worldbean.bean.entity;

import android.os.Bundle;
import com.xq.worldbean.bean.entity.base.BaseFragmentBean;

public class FragmentBean extends BaseFragmentBean {
    public FragmentBean() {
    }

    public FragmentBean(String fragmentName) {
        super(fragmentName);
    }

    public FragmentBean(String fragmentName, Bundle fragmentArguments) {
        super(fragmentName, fragmentArguments);
    }

    public FragmentBean(String id, String fragmentName) {
        super(id, fragmentName);
    }

    public FragmentBean(String id, String fragmentName, Bundle fragmentArguments) {
        super(id, fragmentName, fragmentArguments);
    }
}
