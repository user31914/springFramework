package com.hhit.code;

import com.hhit.model.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCheckStudentGender {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean.xml");
        Manager manager = atx.getBean(Manager.class);
        //manager.checkStudent();
        manager.checkLibraryCard();
    }
}
