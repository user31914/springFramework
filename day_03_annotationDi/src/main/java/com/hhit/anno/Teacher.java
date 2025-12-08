package com.hhit.anno;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component("teacherTest")
public class Teacher {
    @Value("${bean.name}")
    private String name;
    @Value("23")
    private int age;
//    @Autowired
//    @Qualifier("student")
    //字段注入
    @Resource
    private Student student;

    //构造方法注入
//    @Autowired
//    public Teacher(Student student){
//        this.student = student;
//    }
}
