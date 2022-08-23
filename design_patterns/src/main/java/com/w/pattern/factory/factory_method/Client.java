package com.w.pattern.factory.factory_method;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建coffee工厂对象
        ICoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        //创建CoffeeStore对象
        CoffeeStore coffeeStore = new CoffeeStore();
        //injection(注入工厂对象)
        coffeeStore.setFactory(coffeeFactory);
        //点coffee
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
