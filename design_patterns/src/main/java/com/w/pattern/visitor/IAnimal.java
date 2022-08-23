package com.w.pattern.visitor;



/**
 * @author blue
 * @version 1.0
 */
public interface IAnimal {

    //接收喂食
    void accept(IPerson person);
}
