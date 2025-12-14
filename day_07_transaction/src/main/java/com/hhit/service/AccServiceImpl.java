package com.hhit.service;

import com.hhit.entity.Acc;
import com.hhit.entity.Records;
import com.hhit.mapper.AccMapper;
import com.hhit.mapper.RecordsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service("accServiceImpl")
public class AccServiceImpl implements AccService {
    @Resource
    private AccMapper accMapper;
    @Resource
    private RecordsMapper recordsMapper;

    @Override
//    @Transactional(
//            propagation = Propagation.REQUIRED,
//            isolation = Isolation.REPEATABLE_READ,
//            timeout = 3
//    )
    public void doPay(int money) {
        Records records = new Records();
        records.setAccno("111222").setCategory("转出").setMoney(money);
        recordsMapper.insert(records);
        System.out.println("执行交易记录处理");

        //int i  = 10/0;
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Acc acc = new Acc();
        acc.setMoney(money).setAccno("111222");
        accMapper.update(acc);
        System.out.println("执行用户余额修改处理");

    }
}
