package com.hhit.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InstanceFactory {
    public  Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=GMT%2B8&useSSL=false";
            String username = "root";
            String password = "123456";
            Connection connection = DriverManager.getConnection(url, username, password);
            return  connection;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
