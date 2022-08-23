package com.w.pattern.template;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ConcreteClass_Cabbage cabbage = new ConcreteClass_Cabbage();
        cabbage.cookProcess();

        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
