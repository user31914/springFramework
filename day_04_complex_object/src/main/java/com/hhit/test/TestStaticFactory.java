package com.hhit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestStaticFactory {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = (Connection) atx.getBean("staticConnection");
    }
}
