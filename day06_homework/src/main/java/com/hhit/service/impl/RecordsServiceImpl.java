package com.hhit.service.impl;

import com.hhit.entity.Acc;
import com.hhit.entity.Records;
import com.hhit.mapper.AccountMapper;
import com.hhit.mapper.RecordsMapper;
import com.hhit.service.RecordsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Service
public class RecordsServiceImpl implements RecordsService {
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private RecordsMapper recordsMapper;
    @Override
//    @Transactional(timeout = 5)
    public void toUp(Acc acc, int num) {
        Acc user = accountMapper.login(acc);
        if (user!=null){
            user.setCoupon(num);
            accountMapper.updateToUp(user);
            System.out.println("充值成功");
        }else {
            System.out.println("登录失败");
            return;
        }
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Records records = new Records();
        records.setCategory("充值").setAccount(user.getAccount()).setNum(num).setUpdateTime(LocalDateTime.now());
        recordsMapper.save(records);
        System.out.println("消费记录更新成功");
    }

    @Override
    public void consume(Acc acc, int num) {
        Acc user = accountMapper.login(acc);
        if (user!=null){
            int coupon = user.getCoupon();
            if(coupon<num){
                System.out.println("点券余额不足");
            }else {
                user.setCoupon(num);
                accountMapper.updateConsume(user);
                System.out.println("消费成功");
            }
        }else {
            System.out.println("登录失败");
            return;
        }
        Records records = new Records();
        records.setCategory("消费").setAccount(user.getAccount()).setNum(num).setUpdateTime(LocalDateTime.now());
        recordsMapper.save(records);
        System.out.println("消费记录更新成功");
    }

}
