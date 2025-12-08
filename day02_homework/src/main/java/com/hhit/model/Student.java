package com.hhit.model;

import lombok.Data;

import java.util.Map;

@Data
public class Student {
    private String name;
    private String gender;
    private LibraryCard libraryCard;
    private Map<String,Double> score;
}
