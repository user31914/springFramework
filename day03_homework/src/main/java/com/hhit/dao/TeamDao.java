package com.hhit.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.hhit.model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public interface TeamDao {
    default DruidDataSource getDataSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        return dataSource;
    }

    void add(Team team);

    void delete(int id);
}
