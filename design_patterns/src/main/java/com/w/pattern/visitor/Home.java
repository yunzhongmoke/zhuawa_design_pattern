package com.w.pattern.visitor;

import javafx.animation.Animation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class Home {

    //聚合Animal
    private List<IAnimal> list = new ArrayList<>();

    //集合添加元素
    public void addAnimal(IAnimal animal) {
        list.add(animal);
    }

    //animal对象被访问者访问
    public void action(IPerson person) {
        //遍历list集合
        list.forEach(animal -> animal.accept(person));
    }
}
