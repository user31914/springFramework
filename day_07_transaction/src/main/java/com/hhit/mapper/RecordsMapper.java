package com.hhit.mapper;

import com.hhit.entity.Records;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsMapper {
    @Insert("insert into records values(default,#{accno},#{category},#{money})")
    void insert(Records records);
}
