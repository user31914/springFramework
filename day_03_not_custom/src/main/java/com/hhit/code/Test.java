package com.hhit.code;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        HikariDataSource dataSource = ctx.getBean(HikariDataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
