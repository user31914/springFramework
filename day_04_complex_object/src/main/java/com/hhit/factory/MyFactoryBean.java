package com.hhit.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public interface MyFactoryBean<T> {
    T getObject() throws Exception;


     Class<?> getObjectType();

     default boolean isSingleton(){
         return true;
     }
}
