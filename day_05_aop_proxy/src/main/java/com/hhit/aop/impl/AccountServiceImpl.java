package com.hhit.aop.impl;

import com.hhit.aop.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("银行保存财务业务");
    }

    @Override
    public void pay() {
        System.out.println("银行完成支付业务");
    }
}
