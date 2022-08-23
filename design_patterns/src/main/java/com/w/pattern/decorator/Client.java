package com.w.pattern.decorator;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        FastFood friedNoodles = new FriedNoodles();
        System.out.println(friedNoodles.cost());

        friedNoodles = new Egg(friedNoodles);
        System.out.println(friedNoodles.cost());
        System.out.println(friedNoodles.getDescription());

        friedNoodles = new Bacon(friedNoodles);
        System.out.println(friedNoodles.cost());
        System.out.println(friedNoodles.getDescription());
    }
}
