package com.hhit.factory;

public class Orange implements Fruit{
    @Override
    public void plan() {
        System.out.println("种植橘子");
    }

    @Override
    public void grow() {
        System.out.println("橘子生长");
    }

    @Override
    public void gain() {
        System.out.println("收获橘子");
    }
}
