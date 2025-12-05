package com.hhit.student;

public class StudentDaoImpl2 implements  StudentDao{
    @Override
    public void save(Student student) {
        System.out.println("StudentDao的实现类2保存学生数据");
        System.out.println(student);
    }
}
