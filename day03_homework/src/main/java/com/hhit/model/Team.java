package com.hhit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@Accessors(chain = true)
public class Team {

    @Value("夕阳红")
    private String name;
    @Value("江西省南昌市")
    private String addr;

}
