package com.xq.worldbean.bean.entity;

import android.support.v4.app.Fragment;

import com.xq.worldbean.bean.entity.base.BaseFragmentTitleBean;

public class FragmentTitleBean extends BaseFragmentTitleBean<FragmentTitleBean> {
    public FragmentTitleBean() {
    }

    public FragmentTitleBean(Fragment fragment) {
        super(fragment);
    }

    public FragmentTitleBean(CharSequence title, Fragment fragment) {
        super(title, fragment);
    }

    public FragmentTitleBean(int id, CharSequence title, Fragment fragment) {
        super(id, title, fragment);
    }
}
