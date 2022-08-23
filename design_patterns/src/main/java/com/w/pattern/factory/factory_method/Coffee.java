package com.w.pattern.factory.factory_method;

/**
 * @author blue
 * @version 1.0
 */
public abstract class Coffee {

    //获取coffee名称
    public abstract String getName();

    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
