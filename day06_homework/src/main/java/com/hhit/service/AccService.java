package com.hhit.service;

import com.hhit.entity.Acc;

import java.util.List;

public interface AccService {
    void save(Acc acc);

    List<Acc> selectList();

    Acc login(Acc acc);
}
