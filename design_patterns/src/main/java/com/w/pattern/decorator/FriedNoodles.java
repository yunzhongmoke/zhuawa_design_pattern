package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12, "fried noodles");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
