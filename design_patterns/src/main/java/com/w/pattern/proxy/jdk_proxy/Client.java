package com.w.pattern.proxy.jdk_proxy;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ProxyFactory<ISellTicket> proxyFactory = new ProxyFactory<>();
        ISellTicket proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
