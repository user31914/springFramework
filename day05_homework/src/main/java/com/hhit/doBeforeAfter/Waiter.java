package com.hhit.doBeforeAfter;

import org.springframework.stereotype.Component;

@Component
public class Waiter {
    public void showMenu(){
        System.out.println("请看一下菜单");
    }

    public void payMoney(){
        System.out.println("请扫码支付");
    }
}
