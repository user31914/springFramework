package com.hhit.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMulFile {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_main.xml");
        UserService service = ctx.getBean(UserService.class);
        service.save();
    }
}
