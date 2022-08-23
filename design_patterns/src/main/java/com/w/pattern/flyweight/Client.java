package com.w.pattern.flyweight;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //获取BoxFactory对象
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox iBox = boxFactory.getBox("I");
        iBox.display("white");

        AbstractBox LBox = boxFactory.getBox("L");
        iBox.display("gray");

        System.out.println(iBox == LBox);
    }
}
