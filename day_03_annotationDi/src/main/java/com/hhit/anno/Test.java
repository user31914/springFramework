package com.hhit.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Teacher teacher = (Teacher) ctx.getBean("teacherTest");
        System.out.println(teacher);
    }
}
