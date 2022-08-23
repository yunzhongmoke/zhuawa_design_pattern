package com.w.pattern.factory.factory_method;

/**
 * @author blue
 * @version 1.0
 */
public class CoffeeStore {

    //定义coffee工厂对象
    private ICoffeeFactory factory;

    public void setFactory(ICoffeeFactory factory) {
        this.factory = factory;
    }

    //点coffee
    public Coffee orderCoffee() {

        //获取coffee对象
        Coffee coffee = factory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
