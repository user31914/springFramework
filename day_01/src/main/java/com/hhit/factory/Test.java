package com.hhit.factory;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = Factory.getFruit("apple");
        fruit.plan();
        fruit.grow();
        fruit.gain();
    }
}
