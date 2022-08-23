package com.w.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author blue
 * @version 1.0
 */
public class Order {

    //餐桌号
    private int diningTable;
    //食物及份数
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String foodName, int number) {
        this.foodDir.put(foodName, number);
    }

    public Order() {
        this.diningTable = diningTable;
    }
}
