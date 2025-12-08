package com.hhit.model;

import lombok.Data;

import java.util.List;

@Data
public class Manager {
    private List<Student> students;

    public void checkStudent() {
        for (Student student : students) {
            if ("男".equals(student.getGender())) {
                System.out.println(student.getName() + "可以进入浴室");
            }
        }
    }
    public void checkLibraryCard(){
        for (Student student : students) {
            LibraryCard card = student.getLibraryCard();
            if("红色".equals(card.getColor()) && "A".equals(card.getLevel())){
                System.out.println(student.getName()+"持有红色A类借书证,可以借到《java基础图书》");
            }
            else if("红色".equals(card.getColor()) && "B".equals(card.getLevel())){
                System.out.println(student.getName()+"持有红色B类借书证,可以借到《html》");
            }
            else if("蓝色".equals(card.getColor()) && "A".equals(card.getLevel())){
                System.out.println(student.getName()+"持有蓝色A类借书证,可以借到《oracle数据库》");
            }
            else {
                System.out.println(student.getName()+"持有"+card.getColor()+card.getLevel()+"类借书证,可以借到《三国演义》");
            }
        }
    }
}
