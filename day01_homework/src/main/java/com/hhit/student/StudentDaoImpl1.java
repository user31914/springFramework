package com.hhit.student;

public class StudentDaoImpl1 implements StudentDao{

    @Override
    public void save(Student student) {
        System.out.println("StudentDao的实现类1保存学生数据");
        System.out.println(student);
    }
}
