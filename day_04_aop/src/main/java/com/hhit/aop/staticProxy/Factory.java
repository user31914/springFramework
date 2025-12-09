package com.hhit.aop.staticProxy;

public class Factory implements Platform{
    @Override
    public void product() {
        System.out.println("生产产品");
    }
}
