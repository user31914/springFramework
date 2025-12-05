package com.hhit.user;

public class Test {
    public static void main(String[] args) {
//        UserService service =new UserServiceImpl();
//        service.save();
        Boy boy = (Boy)XmlBeanFactory.getBean("D:\\project\\springFramework\\day_01\\src\\main\\resources\\bean.xml","boy");
        System.out.println(boy);
    }
}
