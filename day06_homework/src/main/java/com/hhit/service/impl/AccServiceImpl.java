package com.hhit.service.impl;

import com.hhit.entity.Acc;
import com.hhit.mapper.AccountMapper;
import com.hhit.service.AccService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class AccServiceImpl implements AccService {
    @Resource
    private AccountMapper accountMapper;
    @Override
    public void save(Acc acc) {
        accountMapper.save(acc);
    }

    @Override
    public List<Acc> selectList() {
        return accountMapper.selectList();
    }

    @Override
    public Acc login(Acc acc) {
        return accountMapper.login(acc);
    }
}
