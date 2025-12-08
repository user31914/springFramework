package com.hhit.dao.impl;

import com.hhit.dao.TeamDao;
import com.hhit.model.Team;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("teamImpl")
public class TeamDaoImpl implements TeamDao {

    @Override
    public void add(Team team) {
        System.out.println("添加了球队");
        System.out.println(team);
    }

    @Override
    public void delete(int id) {
        System.out.println("删除了球队");
        System.out.println("删除id为"+id+"的球队");
    }
}
