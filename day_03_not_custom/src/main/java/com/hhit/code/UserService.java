package com.hhit.code;

import lombok.Data;

@Data
public class UserService {
    private UserDao dao;

    public void save() {
        dao.save();
    }
}
