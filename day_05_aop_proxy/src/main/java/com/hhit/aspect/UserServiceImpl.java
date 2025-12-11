package com.hhit.aspect;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String name, String pwd) {
        if ("huanghua".equals(name) && "123456".equals(pwd)) {
            System.out.println("登陆成功");
            return true;
        }
        return false;
    }

    @Override
    public boolean testUser(String acc) {
        return false;
    }
}
