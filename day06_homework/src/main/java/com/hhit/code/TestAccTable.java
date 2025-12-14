package com.hhit.code;

import com.hhit.entity.Acc;
import com.hhit.service.AccService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccTable {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccService service = context.getBean(AccService.class);
        Acc acc = new Acc();
        acc.setAccount("hh123").setPassword("111222");
        //对表进行加入数据
        //service.save(acc);

        //显示表中的数据
//        List<Acc> accs = service.selectList();
//        accs.forEach(System.out::println);

        //用户登录处理
//        Acc user = service.login(acc);
//        if (user != null)
//            System.out.println("欢迎用户【" + user.getAccount() + "】登录");
//        else
//            System.out.println("登录失败");
    }
}
