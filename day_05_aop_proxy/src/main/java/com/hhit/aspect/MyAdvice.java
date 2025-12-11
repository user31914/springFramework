package com.hhit.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Aspect
public class MyAdvice {
    @Pointcut(value = "execution(* showMenu(..))")
    private void myPointcut(){

    }
    //前置通知
   // @Before(value = "execution(* showMenu(..))")
    @Before(value = "myPointcut()")
    public void doBefore() {
        System.out.println("欢迎光临餐厅");
        System.out.println("很高兴为您服务");

    }

    //最终通知
    @After(value = "execution( * pay(..))")
    public void doAfter() {
        System.out.println("欢迎下次光临");
    }

    //后置通知
    @AfterReturning(value = "execution(* login(..))", returning = "result")
    public void log(JoinPoint point, Object result) {
        boolean flag = (boolean) result;
        if (flag) {
            System.out.println("开始生成日志...");
            String name = (String) point.getArgs()[0];
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("D://login.log", true));
                bw.write("访问用户：" + name);
                bw.newLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String time = formatter.format(LocalDateTime.now());
                bw.write("访问时间：" + time);
                bw.close();
                System.out.println("完成日志生成");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("登陆成功");
        }
    }

    //环绕通知
    @Around(value = "execution(* pay(..))")
    public Object transaction(ProceedingJoinPoint point) {
        System.out.println("开启事务");
        Object[] args = point.getArgs();
        String acc = null;
        if(args!=null){
            acc = (String) args[0];
        }
        Object proceed = null;
        if("123456".equals(acc)){
            try {
                 proceed = point.proceed();
                 proceed=  false;
                System.out.println(proceed);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("支付失败");
        }
        System.out.println("事务提交");
        return proceed;
    }

    //异常通知
    @AfterThrowing(value = "execution(* showMenu(..))")
    public void catchException(){
        System.out.println("出现异常");
    }
}
