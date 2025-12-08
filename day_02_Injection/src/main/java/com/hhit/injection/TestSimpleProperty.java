package com.hhit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSimpleProperty {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
        Boy boy =(Boy) ctx.getBean("boy");
        boy.getGF();
    }
}
