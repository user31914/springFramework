package com.hhit.travelVerificationSystem;

import org.springframework.stereotype.Component;

@Component
public class TravelImpl implements Travel {
    @Override
    public boolean travel(User user) {
        System.out.println("您好," + user.getName() + ",欢迎您乘坐从" +
                user.getDepartureLocation() + "地到" + user.getDestination() + "地的航班");
        return true;
    }
}
