package com.hhit.aop.staticProxy;

public class VBuss implements Platform{
    private Factory factory;
    @Override
    public void product() {
        add_friend();
        share();
        if(factory==null){
            factory = new Factory();
        }
        factory.product();
        send_goods();
    }
    public void add_friend(){
        System.out.println("加好友");
    }
    public void share(){
        System.out.println("发朋友圈");
    }
    public void send_goods(){
        System.out.println("送货");
    }
}
