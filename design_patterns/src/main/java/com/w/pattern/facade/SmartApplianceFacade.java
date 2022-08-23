package com.w.pattern.facade;

/**
 * @author blue
 * @version 1.0
 */
public class SmartApplianceFacade {

    //聚合电器
    private Light light;
    private TV tv;
    private AirConditioner airConditioner;

    public SmartApplianceFacade() {
        //初始化
        light = new Light();
        tv = new TV();
        airConditioner = new AirConditioner();
    }

    //通过语言控制
    public void say(String message) {

        if (message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            off();
        } else {
            System.out.println("暂不支持！！！");
        }
    }

    //一键开启
    public void on() {
        light.on();
        tv.on();
        airConditioner.on();
    }

    //一键关闭
    public void off() {
        light.off();
        tv.off();
        airConditioner.off();
    }
}
