package com.xq.worldbean.bean.entity;

import com.xq.worldbean.bean.entity.base.BaseLevel;

public class LevelBean extends BaseLevel {
    public LevelBean() {
    }

    public LevelBean(int level) {
        super(level);
    }

    public LevelBean(int level, CharSequence levelDescriptor) {
        super(level, levelDescriptor);
    }

    public LevelBean(String id, int level) {
        super(id, level);
    }

    public LevelBean(String id, int level, CharSequence levelDescriptor) {
        super(id, level, levelDescriptor);
    }
}
