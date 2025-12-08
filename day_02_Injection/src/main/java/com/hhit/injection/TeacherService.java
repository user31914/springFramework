package com.hhit.injection;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class TeacherService {
    private TeacherDao dao;
    private String name;
    private int age;
    private String[]addrs;
    private Set<String>set;
    private Set<Teacher>teachers;
    private List<String>list;
    private Map<String,Double> map;
    private Properties properties;

}
