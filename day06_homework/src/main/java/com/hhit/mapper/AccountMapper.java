package com.hhit.mapper;

import com.hhit.entity.Acc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    @Insert("insert into acc values (default,#{account},#{password},#{coupon})")
    void save(Acc acc);

    @Select("select * from acc")
    List<Acc> selectList();

    @Select("select * from acc where account = #{account} and password = #{password}")
    Acc login(Acc acc);

    @Update("update acc set coupon = coupon + #{coupon} where account = #{account} ")
    void updateToUp(Acc acc);

    @Update("update acc set coupon = coupon - #{coupon} where account = #{account} ")
    void updateConsume(Acc acc);
}
