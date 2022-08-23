package com.w.pattern.singleton.demo01_hungry_han_style;

/**
 * @author blue
 * @version 1.0
 * 饿汉式
 */
public class Singleton {

    //私有的构造器
    private Singleton() {}

    //在本类中创建本类对象
//    private static Singleton instance = new Singleton();

    //定义该类对象
    private static Singleton instance;

    //初始化该类对象
    static {
        instance = new Singleton();
    }

    //获取本类对象
    public static Singleton getInstance() {
        return instance;
    }
}
