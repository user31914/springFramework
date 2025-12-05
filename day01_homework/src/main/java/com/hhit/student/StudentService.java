package com.hhit.student;

import lombok.Data;

@Data
public class StudentService {
    private StudentDao dao;


    public void save(Student student){
        dao.save(student);
    }
}
