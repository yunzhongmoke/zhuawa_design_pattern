package com.w.pattern.mediator;

/**
 * @author blue
 * @version 1.0
 */
public abstract class Person {

    private String name;
    private Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    //与中介者联系
    public void contact(String message) {
        this.getMediator().contact(message, this);
    }
}
