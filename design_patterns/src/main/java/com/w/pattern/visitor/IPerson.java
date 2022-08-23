package com.w.pattern.visitor;

/**
 * @author blue
 * @version 1.0
 */
public interface IPerson {

    //喂食
    void feed(Dog dog);
    void feed(Cat cat);
}
