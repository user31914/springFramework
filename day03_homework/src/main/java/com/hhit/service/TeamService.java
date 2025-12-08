package com.hhit.service;

import com.hhit.dao.TeamDao;
import com.hhit.model.Team;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class TeamService {

    @Resource(name = "teamImpl")
    private TeamDao dao;

    public void add(Team team) {
        dao.add(team);
    }

    public void delete(int id) {
        dao.delete(id);
    }
}
