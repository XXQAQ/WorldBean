package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseLevel;

public class LevelBean extends BaseLevel<LevelBean> {
    public LevelBean() {
    }

    public LevelBean(int level) {
        super(level);
    }

    public LevelBean(int level, CharSequence levelDescriptor) {
        super(level, levelDescriptor);
    }

    public LevelBean(int id, int level) {
        super(id, level);
    }

    public LevelBean(int id, int level, CharSequence levelDescriptor) {
        super(id, level, levelDescriptor);
    }
}
