package com.hhit.user;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = (Teacher) BeanFactory.getBean("teacher");
        System.out.println(teacher);
    }
}
