package com.hhit.code;

public class UserDaoImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("执行了保存方法");
    }
}
