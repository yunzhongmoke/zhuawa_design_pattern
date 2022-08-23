package com.w.pattern.factory.abstract_factory;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建工厂对象
        IDessertFactory factory = new AmericanDessertFactory();
        //创建coffee store
        CoffeeStore coffeeStore = new CoffeeStore();
        //injection
        coffeeStore.setFactory(factory);

        Coffee coffee = coffeeStore.orderCoffee();
        Dessert dessert = coffeeStore.orderDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
