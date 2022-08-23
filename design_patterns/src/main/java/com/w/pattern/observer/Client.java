package com.w.pattern.observer;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Subject subject = new SubscriptionSubject();
        subject.attach(new WeChatUser("孙悟空"));
        subject.attach(new WeChatUser("猪八戒"));
        subject.attach(new WeChatUser("沙和尚"));

        subject.notify("师傅被抓了");
    }
}
