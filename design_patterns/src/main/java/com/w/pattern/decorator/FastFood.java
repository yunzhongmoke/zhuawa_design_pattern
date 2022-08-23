package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public abstract class FastFood {

    private double price;
    private String description;

    public FastFood() {
    }

    public FastFood(double price, String description) {
        this.price = price;
        this.description = description;
    }

    //计算花费的价钱
    public abstract double cost();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
