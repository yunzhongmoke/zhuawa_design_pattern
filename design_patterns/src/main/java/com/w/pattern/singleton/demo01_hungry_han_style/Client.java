package com.w.pattern.singleton.demo01_hungry_han_style;

/**
 * @author blue
 * @version 1.0
 * 测试类
 */
public class Client {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //比较两个对象是否为同一对象
        boolean flag = instance1 == instance2;
        System.out.println(flag);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
