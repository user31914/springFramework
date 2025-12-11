package com.hhit.doBeforeAfter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvice {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter waiter = context.getBean(Waiter.class);
        Salesperson salesperson = context.getBean(Salesperson.class);
        salesperson.choose();
        salesperson.pay();
        waiter.showMenu();
        waiter.payMoney();
    }
}
