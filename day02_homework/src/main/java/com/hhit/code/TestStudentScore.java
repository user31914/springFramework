package com.hhit.code;

import com.hhit.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

public class TestStudentScore {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) atx.getBean("s1");
        calTotalScore(student);
        improveScore(student);
    }
    public static void calTotalScore(Student student){
        Map<String,Double> scores = student.getScore();
        Set<String> strings = scores.keySet();
        double totalScore = 0;
        for (String string : strings) {
            totalScore +=scores.get(string);
        }
        System.out.println(student.getName()+"总成绩为"+totalScore);
    }
    public static void improveScore(Student student){
        Map<String,Double> scores = student.getScore();
        Set<String> strings = scores.keySet();
        double newTotal = 0;
        for (String string : strings) {
            double score =scores.get(string);
            if(score < 60){
                score = score + score/10;
                scores.put(string,score);
            }
            newTotal +=scores.get(string);
        }
        double avgScore = newTotal/strings.size();
        System.out.println("张三提升后的总成绩为:"+newTotal);
        System.out.println("张三提升后的平均成绩为:"+avgScore);
    }
}
