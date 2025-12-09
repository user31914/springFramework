package com.hhit.factory;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Bean {
    private String id;
    private String clazz;
}
