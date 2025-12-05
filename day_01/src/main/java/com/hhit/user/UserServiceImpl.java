package com.hhit.user;

public class UserServiceImpl implements UserService{
    @Override
    public void save() {
     UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
     userDao = (UserDao) XmlBeanFactory.getBean("D:\\project\\springFramework\\day_01\\src\\main\\resources\\bean.xml","userDao");
        userDao.save();
    }
}
