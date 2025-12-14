package com.hhit.service;

import com.hhit.entity.Student;
import com.hhit.mapper.StudentMapper;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> selectList();
}
