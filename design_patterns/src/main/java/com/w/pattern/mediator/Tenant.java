package com.w.pattern.mediator;

/**
 * @author blue
 * @version 1.0
 */
public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //获取回复的信息
    public void getMessage(String message) {
        System.out.println("租房者" + this.getName() +"获取到的信息：" + message);
    }
}
