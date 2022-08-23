package com.w.pattern.visitor;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Owner owner = new Owner();
        Someone someone = new Someone();
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());
        home.action(owner);
        home.action(someone);
    }
}
