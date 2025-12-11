package com.hhit.aspect;

import org.springframework.stereotype.Component;

public interface UserService {
    boolean login(String name, String pwd);
    boolean  testUser(String acc);
}
