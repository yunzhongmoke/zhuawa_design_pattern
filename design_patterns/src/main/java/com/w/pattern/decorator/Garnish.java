package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public abstract class Garnish extends FastFood {

    //聚合FastFood
    private FastFood fastFood;

    public Garnish(FastFood fastFood, double price, String description) {
        super(price, description);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
