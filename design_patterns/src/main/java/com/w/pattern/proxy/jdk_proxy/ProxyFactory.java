package com.w.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author blue
 * @version 1.0
 */
public class ProxyFactory <T> {

    //创建TrainStation对象
    private ISellTicket trainStation =  new TrainStation();

    //获取代理对象
    public T getProxyObject() {

        Object proxyObject = Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理增强
                        System.out.println("proxy point 收取费用");
                        //反射访问方法
                        Object object = method.invoke(trainStation, args);
                        return object;
                    }
                }
                /*(proxy, method, args) -> {
                    //代理增强
                    System.out.println("proxy point 收取费用");
                    //反射访问方法
                    Object object = method.invoke(trainStation, args);
                    return object;
                }*/
        );
        return (T) proxyObject;
    }
}
