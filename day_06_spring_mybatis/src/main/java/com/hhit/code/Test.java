package com.hhit.code;

import com.hhit.entity.Student;
import com.hhit.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl service = context.getBean(StudentServiceImpl.class);
//        List<Student> students = service.selectList();
//        students.forEach(System.out::println);
        Student student = new Student();
        student.setName("张三丰").setAge(20).setGender("男");
        service.save(student);

    }
}
