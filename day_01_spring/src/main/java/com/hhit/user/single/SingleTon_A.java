package com.hhit.user.single;

public class SingleTon_A {

    //懒汉模式
    private SingleTon_A() {
    }

    private static SingleTon_A s = null;

    public static SingleTon_A getInstance() {

        if (s == null) {
            s = new SingleTon_A();
        }
        return s;
    }
}
