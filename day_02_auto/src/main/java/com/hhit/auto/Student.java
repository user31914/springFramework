package com.hhit.auto;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Teacher teacher;
    private School school;
}
