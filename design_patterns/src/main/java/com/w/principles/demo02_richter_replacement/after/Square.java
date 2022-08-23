package com.w.principles.demo02_richter_replacement.after;

/**
 * @author blue
 * @version 1.0
 */
public class Square implements Quadrilateral{

    //边长
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
