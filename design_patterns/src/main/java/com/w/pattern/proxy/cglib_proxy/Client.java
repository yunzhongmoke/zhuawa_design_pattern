package com.w.pattern.proxy.cglib_proxy;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while(true){}
    }
}
