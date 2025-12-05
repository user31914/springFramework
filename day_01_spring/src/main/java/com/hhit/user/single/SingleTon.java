package com.hhit.user.single;

public class SingleTon {

    //饿汉模式
    private SingleTon() {
    }

    private static SingleTon s = new SingleTon();

    public static SingleTon getInstance() {
        return s;
    }
}
