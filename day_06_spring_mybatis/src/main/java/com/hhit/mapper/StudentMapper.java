package com.hhit.mapper;

import com.hhit.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    void save(Student student);
    List<Student> selectList();
}
