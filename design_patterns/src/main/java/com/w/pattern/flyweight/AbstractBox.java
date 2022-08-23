package com.w.pattern.flyweight;

/**
 * @author blue
 * @version 1.0
 */
public abstract class AbstractBox {

    //形状
    public abstract String getShape();

    //展示图形
    public void display(String color) {
        System.out.println("shape : " + getShape() + ", color : " + color);
    }
}
