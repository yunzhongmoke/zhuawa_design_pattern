package com.w.pattern.singleton.demo02_lazy_style;

/**
 * @author blue
 * @version 1.0
 * 懒汉式
 */
public class Singleton {

    //私有构造器
    private Singleton() {}

    //定义Singleton对象
//    private static Singleton instance;

    //获取Singleton对象的方法(线程同步)
//    public static synchronized Singleton getInstance() {
//
//        //判断instance是否为null
//        if (instance == null) {
//            instance = new Singleton();
//        }
//
//        return instance;
//    }

    //定义Singleton对象
//    private static volatile Singleton instance;
//
    //双重检查锁
//    public static Singleton getInstance() {
//
//        //判断instance是否为null
//        if (instance == null) {
//            //加锁
//            synchronized (Singleton.class) {
//                //抢到锁之后再次判断instance是否为null
//                if (instance == null) {
//                    //实例化instance
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    //静态内部类的方式
    private static class SingletonHolder {
        //创建Singleton对象
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {

        return SingletonHolder.INSTANCE;
    }

}
