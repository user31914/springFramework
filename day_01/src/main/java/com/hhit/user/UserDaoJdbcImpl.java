package com.hhit.user;

public class UserDaoJdbcImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("使用jdbc技术实现");
    }
}
