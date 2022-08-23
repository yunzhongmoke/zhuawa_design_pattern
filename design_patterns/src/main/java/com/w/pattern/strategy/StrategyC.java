package com.w.pattern.strategy;

/**
 * @author blue
 * @version 1.0
 */
public class StrategyC implements IStrategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
