package com.w.pattern.builder.example;

/**
 * @author blue
 * @version 1.0
 */
public class Director {

    //定义Builder对象
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车
    public Bike construct() {

        builder.buildFrame();
        builder.buildSeat();

        return builder.createBike();
    }
}
