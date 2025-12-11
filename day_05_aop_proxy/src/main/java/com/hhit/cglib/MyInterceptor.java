package com.hhit.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.LocalDate;

public class MyInterceptor implements MethodInterceptor {
    private Object object;

    public MyInterceptor(Object object) {
        this.object = object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("系统开始监测...");
        Object invoke = method.invoke(object, objects);
        System.out.println("结束监测...");
        System.out.println(LocalDate.now());
        return invoke;
    }
}
