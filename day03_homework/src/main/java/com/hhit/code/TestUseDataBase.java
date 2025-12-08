package com.hhit.code;

import com.hhit.dao.impl.TeamImpl2;
import com.hhit.model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUseDataBase {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeamImpl2 teamImpl2 = ctx.getBean(TeamImpl2.class);
//        Team team = new Team();
//        team.setName("凯尔特人").setAddr("马萨诸塞州波士顿");
//        teamImpl2.add(team);
        teamImpl2.delete(4);
    }
}
