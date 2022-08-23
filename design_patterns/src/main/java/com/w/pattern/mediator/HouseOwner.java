package com.w.pattern.mediator;

/**
 * @author blue
 * @version 1.0
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }


    //获取回复的信息
    public void getMessage(String message) {
        System.out.println("房主" + this.getName() +"获取到的信息：" + message);
    }
}
