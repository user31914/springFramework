package com.hhit.doBeforeAfter;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Before(value = "execution(* showMenu(..))")
    public void doBefore(){
        System.out.println("您好，欢迎光临");
    }

    @Before(value = "execution(* choose(..))")
    public void doBefore2(){
        System.out.println("您好，欢迎光临");
    }

    @After(value ="execution(* pay(..))")
    public void doAfter(){
        System.out.println("慢走，欢迎再来");
    }
    @After(value ="execution(* payMoney(..))")
    public void doAfter2(){
        System.out.println("请带好您的随身物品，慢走，欢迎再来");
    }
}
