package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "egg");
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
