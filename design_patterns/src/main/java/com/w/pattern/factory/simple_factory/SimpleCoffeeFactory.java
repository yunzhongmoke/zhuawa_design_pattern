package com.w.pattern.factory.simple_factory;

/**
 * @author blue
 * @version 1.0
 */
public class SimpleCoffeeFactory {

    //定义Coffee对象
    private static Coffee coffee = null;

    //制造coffee
    public static Coffee createCoffee(String type) {

        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有该coffee");
        }
        return coffee;
    }
}
