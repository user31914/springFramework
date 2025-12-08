package com.hhit.anno;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    @Value("李四")
    private String name;
    @Value("24")
    private String age;
}
