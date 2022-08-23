package com.w.pattern.factory.abstract_factory;

/**
 * @author blue
 * @version 1.0
 */
public class ItalyDessertFactory implements IDessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
