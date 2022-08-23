package com.w.pattern.factory.factory_method;

/**
 * @author blue
 * @version 1.0
 */
public class AmericanCoffeeFactory implements ICoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
