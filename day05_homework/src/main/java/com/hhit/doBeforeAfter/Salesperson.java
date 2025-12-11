package com.hhit.doBeforeAfter;

import org.springframework.stereotype.Component;

@Component
public class Salesperson {
    public void choose() {
        System.out.println("购买什么商品?");
    }

    public void pay() {
        System.out.println("请扫码支付");
    }
}
