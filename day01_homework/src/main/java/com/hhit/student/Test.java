package com.hhit.student;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = (Student) atx.getBean("student");
        StudentService service = (StudentService)atx.getBean("studentService");
        service.save(student);
    }
}
