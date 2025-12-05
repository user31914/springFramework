package com.hhit.user;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class BeanFactory {
    public static Object getBean(String className){
        ResourceBundle rb = ResourceBundle.getBundle("bean");
        String string = rb.getString(className);
        try {
            Class<?> aClass = Class.forName(string);
            Object o = aClass.getConstructor().newInstance();
            return o;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
