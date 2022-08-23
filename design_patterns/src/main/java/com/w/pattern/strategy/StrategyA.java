package com.w.pattern.strategy;

/**
 * @author blue
 * @version 1.0
 */
public class StrategyA implements IStrategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
