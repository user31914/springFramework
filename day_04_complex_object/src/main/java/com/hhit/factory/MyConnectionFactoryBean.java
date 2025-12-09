package com.hhit.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionFactoryBean implements MyFactoryBean<Connection>{
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=GMT%2B8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }
}
