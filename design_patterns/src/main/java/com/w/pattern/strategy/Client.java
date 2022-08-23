package com.w.pattern.strategy;

import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Salesman salesman = new Salesman(new StrategyA());
        salesman.show();

        System.out.println("===========");
        salesman.setStrategy(new StrategyB());
        salesman.show();
    }
}
