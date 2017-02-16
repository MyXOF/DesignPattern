package com.corp.myxof.dp.bridge;

public abstract class Abstraction {
    protected Implementor impl;
    
    protected abstract void Operation();

    public Implementor getImpl() {
        return impl;
    }

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }
    
    
}
