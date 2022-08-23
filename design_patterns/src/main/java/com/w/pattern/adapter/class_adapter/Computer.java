package com.w.pattern.adapter.class_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class Computer {

    public void readSDCard(ISDCard sdCard) {

        //判断sdCard是否为null
        if (sdCard == null) {
            throw new NullPointerException("sd card can't be null");
        }
        sdCard.readSD();
    }
}
