package com.w.pattern.strategy;

/**
 * @author blue
 * @version 1.0
 */
public class StrategyB implements IStrategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
