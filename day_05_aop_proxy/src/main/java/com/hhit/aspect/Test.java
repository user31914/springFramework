package com.hhit.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter waiter = context.getBean(Waiter.class);
         waiter.showMenu();
//        System.out.println("---------------------");
//        boolean pay = waiter.pay("123456");
//        System.out.println(pay);
    }
}
