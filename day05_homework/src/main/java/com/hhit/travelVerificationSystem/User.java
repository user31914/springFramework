package com.hhit.travelVerificationSystem;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
@Component
public class User {
    private String name;
    private String departureLocation;
    private String destination;
    private LocalDate time;
}
