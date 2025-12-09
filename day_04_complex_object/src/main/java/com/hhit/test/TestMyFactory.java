package com.hhit.test;

import com.hhit.factory.Factory;

public class TestMyFactory {
    public static void main(String[] args) {
        Object factory = Factory.getBean("&factoryBean");
        System.out.println(factory);
    }
}
