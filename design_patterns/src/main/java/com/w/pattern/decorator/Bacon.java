package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "bacon");
    }

    @Override
    public double cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+" + getFastFood().getDescription();
    }
}
