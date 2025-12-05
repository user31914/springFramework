package com.hhit.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //加载spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        System.out.println(userDao);

        Boy boy = (Boy) ctx.getBean("boy");
//        System.out.println(boy);
        boy.getGF();
    }
}
