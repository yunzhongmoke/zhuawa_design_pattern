package com.w.pattern.proxy.static_proxy;

/**
 * @author blue
 * @version 1.0
 */
public class ProxyPoint implements ISellTicket{

    //创建TrainStation对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("proxy point 收取部分费用");
        trainStation.sell();
    }
}
