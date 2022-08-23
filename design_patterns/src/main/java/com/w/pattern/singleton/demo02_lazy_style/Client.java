package com.w.pattern.singleton.demo02_lazy_style;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author blue
 * @version 1.0
 * 测试类
 */
public class Client {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//
//        //比较两个对象是否为同一对象
//        boolean flag = instance1 == instance2;
//        System.out.println(flag);
//        System.out.println(instance1);
//        System.out.println(instance2);

        //获取字节码对象
        Class singletonClass = Singleton.class;
        Constructor constructor = singletonClass.getDeclaredConstructor();
        //取消访问检查(暴力反射)
        constructor.setAccessible(true);
        Singleton instance1 = (Singleton) constructor.newInstance();
        Singleton instance2 = (Singleton) constructor.newInstance();
        //比较两个对象是否为同一对象
        boolean flag = instance1 == instance2;
        System.out.println(flag);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
