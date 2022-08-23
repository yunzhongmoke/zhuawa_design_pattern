package com.w.pattern.factory.simple_factory;

/**
 * @author blue
 * @version 1.0
 */
public class CoffeeStore {

    //客户点coffee
    public Coffee orderCoffee(String type) {

        //获取Coffee对象
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
