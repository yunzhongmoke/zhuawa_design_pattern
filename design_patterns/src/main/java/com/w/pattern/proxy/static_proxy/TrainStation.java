package com.w.pattern.proxy.static_proxy;

/**
 * @author blue
 * @version 1.0
 */
public class TrainStation implements ISellTicket{
    @Override
    public void sell() {
        System.out.println("train station sell ticket");
    }
}
