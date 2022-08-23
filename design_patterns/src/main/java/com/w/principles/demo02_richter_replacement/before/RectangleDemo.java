package com.w.principles.demo02_richter_replacement.before;

/**
 * @author blue
 * @version 1.0
 */
public class RectangleDemo {

    public static void main(String[] args) {

        //创建Rectangle对象
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(20);
//        rectangle.setWidth(10);
//        resize(rectangle);
//        printLengthAndWidth(rectangle);
        //创建一个Square对象(无法直接使用基类的方法)
        Square square = new Square();
        square.setLength(20);
        square.setWidth(20);
        resize(square);
        printLengthAndWidth(square);
    }

    //拓宽长方形的宽度
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长方形的长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength() + "," + rectangle.getWidth());
    }
}
