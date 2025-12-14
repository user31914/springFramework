package com.hhit.mapper;

import com.hhit.entity.Acc;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface AccMapper {
    @Update("update acc set money = money - #{money} where accno = #{accno}")
    void update(Acc acc);
}
