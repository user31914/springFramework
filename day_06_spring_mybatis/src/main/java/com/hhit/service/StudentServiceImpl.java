package com.hhit.service;

import com.hhit.entity.Student;
import com.hhit.mapper.StudentMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;

    @Override
    public void save(Student student) {
        mapper.save(student);
    }

    @Override
    public List<Student> selectList() {
        List<Student> students = mapper.selectList();
        return students;
    }
}
