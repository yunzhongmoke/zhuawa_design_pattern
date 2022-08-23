package com.w.pattern.command;

import java.util.Map;

/**
 * @author blue
 * @version 1.0
 */
public class OrderCommand implements ICommand{

    //持有接收者对象
    private Order order;
    private SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单");

        //获取并遍历订单中的食物清单
        Map<String, Integer> foodDir = order.getFoodDir();
        foodDir.keySet().forEach(foodName -> {
            seniorChef.makeFood(foodName, foodDir.get(foodName));
        });

        System.out.println("食物制作完成~~~");
    }
}
