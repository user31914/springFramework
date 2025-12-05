package com.hhit.user.single;

public class Test {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance1==instance2);
    }
}
