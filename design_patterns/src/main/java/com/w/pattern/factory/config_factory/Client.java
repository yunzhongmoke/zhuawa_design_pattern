package com.w.pattern.factory.config_factory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
    }
}
