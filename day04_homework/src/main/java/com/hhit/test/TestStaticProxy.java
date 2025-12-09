package com.hhit.test;

import com.hhit.staticProxy.ChangeAppearance;
import com.hhit.staticProxy.PersonSun;

public class TestStaticProxy {
    public static void main(String[] args) {
        ChangeAppearance personSun = new PersonSun();
        personSun.changeAppearance();
    }
}
