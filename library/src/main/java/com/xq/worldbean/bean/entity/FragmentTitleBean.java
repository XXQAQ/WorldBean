package com.xq.worldbean.bean.entity;

import android.os.Bundle;
import com.xq.worldbean.bean.entity.base.BaseFragmentTitleBean;

public class FragmentTitleBean extends BaseFragmentTitleBean<FragmentTitleBean> {
    public FragmentTitleBean() {
    }

    public FragmentTitleBean(CharSequence title, String fragmentName) {
        super(title, fragmentName);
    }

    public FragmentTitleBean(CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(title, fragmentName, fragmentArguments);
    }

    public FragmentTitleBean(int id, CharSequence title, String fragmentName) {
        super(id, title, fragmentName);
    }

    public FragmentTitleBean(int id, CharSequence title, String fragmentName, Bundle fragmentArguments) {
        super(id, title, fragmentName, fragmentArguments);
    }
}
