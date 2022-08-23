package com.w.pattern.visitor;

/**
 * @author blue
 * @version 1.0
 */
public class Cat implements IAnimal{

    @Override
    public void accept(IPerson person) {
        person.feed(this);
        System.out.println("cats receive food");
    }
}
