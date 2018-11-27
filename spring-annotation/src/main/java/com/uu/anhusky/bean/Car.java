package com.uu.anhusky.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Blue blue;
    private int testInt = 10;

    public Car() {
        System.out.println("car constructor...");
    }

    @Autowired
    public void setBlue111(Blue blue) {
       // System.out.println("testInt ----->" + testInt);
        System.out.println("car -----> setBlue");
        this.blue = blue;
    }

    public void init() {
        System.out.println("car ... init...");
    }

    public void detory() {
        System.out.println("car ... detory...");
    }

}
