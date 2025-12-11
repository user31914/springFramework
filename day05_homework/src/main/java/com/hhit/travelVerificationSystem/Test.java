package com.hhit.travelVerificationSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean(User.class);
        Travel travel = context.getBean(Travel.class);
        user.setName("李四").setDepartureLocation("TianJin").setDestination("JiLin").setTime(LocalDate.now());
        boolean flag = travel.travel(user);
        System.out.println(flag?"出行成功":"出行失败");
    }
}
