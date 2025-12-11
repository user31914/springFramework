package com.hhit.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(service.getClass().getClassLoader());
        enhancer.setSuperclass(service.getClass());
        //enhancer.setCallback(new MyInterceptor(service));

        //使用lambda表达式
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("系统开始监测...");
            Object invoke = method.invoke(service, objects);
            System.out.println("系统结束监测...");
            System.out.println(LocalDate.now());
            return  invoke;
        });
        AccountService accountService = (AccountService) enhancer.create();
        accountService.save();
        accountService.pay();
    }
}
