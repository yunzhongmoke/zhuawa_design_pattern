package com.w.pattern.factory.abstract_factory;

/**
 * @author blue
 * @version 1.0
 */
public class AmericanDessertFactory implements IDessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
