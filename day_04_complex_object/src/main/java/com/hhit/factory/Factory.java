package com.hhit.factory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Factory {
    public static Object getBean(String arg){
        Bean bean = XMLOperator.getBean();
        String className = bean.getClazz();
        if (arg.startsWith("&")){
            Object o = null;
            try {
                 o = Class.forName(className).getConstructor().newInstance();
                return o;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
               Class<?> clazz =  Class.forName(className);
              Object o =  clazz.getConstructor().newInstance();
                Method method = clazz.getDeclaredMethod("getObject");
                Object invoke = method.invoke(o);
                return  invoke;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
