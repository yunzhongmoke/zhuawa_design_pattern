package com.w.pattern.builder.example;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
