package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "fried rice");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
