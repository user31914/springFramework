package com.hhit.injection;

import lombok.Data;

@Data
public class Boy {
    private String name;
    private Girl girl;
    public void getGF(){
        System.out.println(name+"找个了女朋友:"+girl.getName());
    }
}
