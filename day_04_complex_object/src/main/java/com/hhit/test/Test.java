package com.hhit.test;

import com.hhit.factory.MyConnectionBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Connection connection = (Connection) ctx.getBean("connection");
        MyConnectionBean connection =  ctx.getBean(MyConnectionBean.class);
        System.out.println(connection);
    }
}
