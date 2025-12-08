package com.hhit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("bean.xml");
        TeacherService teacherService = (TeacherService)ctx.getBean("teacherService");
        //System.out.println(teacherService);
//        Set<String>set = teacherService.getSet();
//        Set<Teacher>set = teacherService.getTeachers();
//        set.forEach(System.out::println);
//        List<String> list = teacherService.getList();
//        list.forEach(System.out::println);
//        Map<String,Double> map = teacherService.getMap();
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key+"\t"+map.get(key));
//        }
        Properties properties = teacherService.getProperties();
        System.out.println(properties.get("aaa"));
        System.out.println(properties.get("hhh"));
    }
}
