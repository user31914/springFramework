package com.hhit.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object getProxy(Object object, InvocationHandler handler) {
        return Proxy.newProxyInstance(object.getClass().
                getClassLoader(), object.getClass().getInterfaces(), handler);
    }
}
