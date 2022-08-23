package com.w.pattern.observer;

/**
 * @author blue
 * @version 1.0
 */
public interface Subject {

    //添加观察者
    void attach(Observer observer);

    //删除观察者
    void detach(Observer observer);

    //通知观察者
    void notify(String message);
}
