package com.w.pattern.builder.example;

/**
 * @author blue
 * @version 1.0
 */
public abstract class Builder {

    //创建Bike对象
    protected Bike bike = new Bike();

    //构建支架
    public abstract void buildFrame();

    //构建坐垫
    public abstract void buildSeat();

    //构建自行车
    public Bike createBike(){
        return bike;
    }
}
