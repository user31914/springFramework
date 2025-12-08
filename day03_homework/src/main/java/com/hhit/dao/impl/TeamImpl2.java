package com.hhit.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.hhit.dao.TeamDao;
import com.hhit.model.Team;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class TeamImpl2 implements TeamDao {
    @Override
    public void add(Team team) {
        DruidDataSource dataSource = getDataSource();
        String sql = "insert into team values(default,?,?)";
        try {
            DruidPooledConnection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1,team.getName());
            statement.setString(2,team.getAddr());
            statement.execute();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        DruidDataSource dataSource = getDataSource();
        String sql = "delete from team where tid = ?";
        try {
            DruidPooledConnection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.execute();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
