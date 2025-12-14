package com.hhit.code;

import com.hhit.service.AccService;
import com.hhit.service.AccServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccService service =  context.getBean(AccService.class);
        service.doPay(500);
    }
}
