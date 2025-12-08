package com.hhit.code;

import com.hhit.model.Team;
import com.hhit.service.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeamService service = ctx.getBean(TeamService.class);
        Team team = ctx.getBean(Team.class);
        service.add(team);
        service.delete(1);
    }
}
