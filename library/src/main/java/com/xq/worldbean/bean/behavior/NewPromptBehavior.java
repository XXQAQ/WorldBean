package com.xq.worldbean.bean.behavior;


public interface NewPromptBehavior<T extends NewPromptBehavior> extends BaseBehavior<T>{

    public int getNewPrompt();

    public T setNewPrompt(int newPrompt);

}
