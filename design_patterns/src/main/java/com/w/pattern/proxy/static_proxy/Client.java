package com.w.pattern.proxy.static_proxy;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
