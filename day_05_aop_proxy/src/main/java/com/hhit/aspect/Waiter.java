package com.hhit.aspect;

import org.springframework.stereotype.Component;

@Component
public class Waiter {
    public void showMenu(){
        System.out.println("请点菜");
       // int x = 10/0;
    }
    public boolean pay(String acc){
        System.out.println("请付款");
        return true;
    }
}
