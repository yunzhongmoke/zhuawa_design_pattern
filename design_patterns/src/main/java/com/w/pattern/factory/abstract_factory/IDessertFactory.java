package com.w.pattern.factory.abstract_factory;

/**
 * @author blue
 * @version 1.0
 */
public interface IDessertFactory {

    //生产coffee
    Coffee createCoffee();

    //生产dessert
    Dessert createDessert();
}
