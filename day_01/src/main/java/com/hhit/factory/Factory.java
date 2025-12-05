package com.hhit.factory;

public class Factory {
    public static Fruit getFruit(String fruit){
        if (fruit.equals("apple")){
            return new Apple();
        }
        else{
            return new Orange();
        }
    }
}
