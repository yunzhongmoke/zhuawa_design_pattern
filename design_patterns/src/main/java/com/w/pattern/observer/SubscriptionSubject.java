package com.w.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class SubscriptionSubject implements Subject{

    //定义一个单列集合，用于存储观察者对象
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //遍历observerList集合
        observerList.forEach(observer -> {
            observer.update(message);
        });
    }
}
