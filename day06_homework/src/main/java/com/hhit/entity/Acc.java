package com.hhit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Acc {
    private int id;
    private String account;
    private String password;
    private int coupon;
}
