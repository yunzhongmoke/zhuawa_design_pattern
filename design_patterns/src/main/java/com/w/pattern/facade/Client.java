package com.w.pattern.facade;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        SmartApplianceFacade smartApplianceFacade = new SmartApplianceFacade();
        smartApplianceFacade.say("打开电器");

        smartApplianceFacade.say("关闭电器");
    }
}
