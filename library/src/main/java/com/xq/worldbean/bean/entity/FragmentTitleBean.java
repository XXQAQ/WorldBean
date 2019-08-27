package com.xq.worldbean.bean.entity;

import android.os.Bundle;
import com.xq.worldbean.bean.entity.base.BaseFragmentTitleBean;

public class FragmentTitleBean extends BaseFragmentTitleBean {
    public FragmentTitleBean() {
    }

    public FragmentTitleBean(CharSequence title, String fragmentName) {
        super(title, fragmentName);
    }

    public FragmentTitleBean(CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(title, fragmentName, fragmentArguments);
    }

    public FragmentTitleBean(String id, CharSequence title, String fragmentName) {
        super(id, title, fragmentName);
    }

    public FragmentTitleBean(String id, CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(id, title, fragmentName, fragmentArguments);
    }
}
