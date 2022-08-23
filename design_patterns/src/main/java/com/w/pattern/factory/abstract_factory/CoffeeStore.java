package com.w.pattern.factory.abstract_factory;

/**
 * @author blue
 * @version 1.0
 */
public class CoffeeStore {

    private IDessertFactory factory;

    public void setFactory(IDessertFactory factory) {
        this.factory = factory;
    }

    //点coffee
    public Coffee orderCoffee() {

        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    //点dessert
    public Dessert orderDessert() {

        return factory.createDessert();
    }
}
