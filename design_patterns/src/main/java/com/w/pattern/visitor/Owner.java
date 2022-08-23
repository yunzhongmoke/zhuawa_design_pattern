package com.w.pattern.visitor;

/**
 * @author blue
 * @version 1.0
 */
public class Owner implements IPerson{
    @Override
    public void feed(Dog dog) {
        System.out.println("master feeds dog");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("master feeds cat");
    }
}
