package com.hhit.code;

import com.hhit.entity.Acc;
import com.hhit.service.RecordsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestToUp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordsService service = context.getBean(RecordsService.class);
        Acc acc = new Acc();
        acc.setAccount("hh123").setPassword("111222");
        service.toUp(acc,500);
    }
}
