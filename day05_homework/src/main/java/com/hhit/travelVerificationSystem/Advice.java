package com.hhit.travelVerificationSystem;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

@Component
@Aspect
public class Advice {

    @Around(value = "execution(* travel(..))")
    public Object isTravel(ProceedingJoinPoint point) {
        User user = new User();
        Object[] args = point.getArgs();
        boolean res = true;
        if (args != null) {
            user = (User) args[0];
        }
        if (user != null){
            boolean startPlace = CheckAddrUtil.checkAddr(user.getDepartureLocation());
            //出发地为高风险时
            if(startPlace){
                System.out.println(user.getName()+"您好,您出发地"+user.getDepartureLocation()+"是高风险区域，不能出行");
                return false;
            }else if (CheckAddrUtil.checkAddr(user.getDestination())){
                //目的地是高风险时
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("D://travel.log",true));
                    writer.write("用户姓名:"+user.getName());
                    writer.newLine();
                    writer.write("出发地:"+user.getDepartureLocation());
                    writer.newLine();
                    writer.write("目的地:"+user.getDestination());
                    writer.newLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
                    writer.write("出发时间:"+formatter.format(user.getTime()));
                    writer.newLine();
                    writer.write(" ");
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                res = (boolean)point.proceed();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("用户信息出错");
            return false;
        }
        return res;
    }
}
