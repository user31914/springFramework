package com.hhit.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {
    private Object obj;

    public MyInvocationHandle(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始监控系统...");
        long t1 = System.currentTimeMillis();
        Thread.sleep((int) (Math.random() * 2000));
        Object invoke = method.invoke(obj, args);
        long t2 = System.currentTimeMillis();
        System.out.println("结束监控系统");
        long time = t2 - t1;
        System.out.println("一共消费了"+time+"毫秒");
        return invoke;
    }
}
