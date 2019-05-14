package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseCodeBean;

public class CodeBean extends BaseCodeBean<CodeBean> {
    public CodeBean() {
    }

    public CodeBean(int code) {
        super(code);
    }

    public CodeBean(int code, CharSequence codeDescriptor) {
        super(code, codeDescriptor);
    }

    public CodeBean(int id, int code) {
        super(id, code);
    }

    public CodeBean(int id, int code, CharSequence codeDescriptor) {
        super(id, code, codeDescriptor);
    }
}
