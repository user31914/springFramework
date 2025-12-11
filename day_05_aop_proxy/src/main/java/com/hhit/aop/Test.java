package com.hhit.aop;

import com.hhit.aop.impl.AccountServiceImpl;
import com.hhit.aop.impl.UserServiceImpl;
import com.hhit.aop.proxy.MyInvocationHandle;
import com.hhit.aop.proxy.ProxyUtil;

public class Test {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        UserService proxy = (UserService) ProxyUtil.getProxy(service, new MyInvocationHandle(service));
//        proxy.save();
//        proxy.delete();
        AccountService service = new AccountServiceImpl();
    AccountService proxy = (AccountService)ProxyUtil.getProxy(service,new MyInvocationHandle(service));
    proxy.save();
    proxy.pay();
    }
}
