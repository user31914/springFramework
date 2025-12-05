package com.hhit.factory;

public class Apple implements Fruit{
    @Override
    public void plan() {
        System.out.println("种植苹果");
    }

    @Override
    public void grow() {
        System.out.println("苹果生长");
    }

    @Override
    public void gain() {
        System.out.println("收获苹果");
    }
}
