package com.hhit.user;

import lombok.Data;

@Data
public class Boy {
    private String name;
    private String age;
    private Girl girl;
    public void getGF(){
        System.out.println(name+"找到了"+girl.getName()+"做女朋友");
    }
}
