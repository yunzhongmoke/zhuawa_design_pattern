package com.w.pattern.strategy;

/**
 * @author blue
 * @version 1.0
 */
public class Salesman {

    //聚合IStrategy
    private IStrategy strategy;

    public Salesman(IStrategy strategy) {
        this.strategy = strategy;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void show() {
        strategy.show();
    }
}
