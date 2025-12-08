package com.hhit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean2.xml");
        Student student = (Student) atx.getBean("student");
        System.out.println(student);
    }
}
