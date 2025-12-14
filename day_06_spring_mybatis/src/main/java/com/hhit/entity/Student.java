package com.hhit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
}
