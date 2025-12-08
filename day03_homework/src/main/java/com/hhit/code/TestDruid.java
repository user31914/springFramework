package com.hhit.code;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestDruid {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        try {
            DruidPooledConnection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
