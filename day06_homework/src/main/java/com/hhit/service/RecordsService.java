package com.hhit.service;

import com.hhit.entity.Acc;

public interface RecordsService {
    void toUp(Acc acc,int num);
    void consume(Acc acc,int num);
}
