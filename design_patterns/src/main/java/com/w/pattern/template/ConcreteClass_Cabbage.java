package com.w.pattern.template;

/**
 * @author blue
 * @version 1.0
 */
public class ConcreteClass_Cabbage extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
