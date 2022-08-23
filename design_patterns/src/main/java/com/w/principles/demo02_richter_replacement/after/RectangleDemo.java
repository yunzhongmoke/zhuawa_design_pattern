package com.w.principles.demo02_richter_replacement.after;

/**
 * @author blue
 * @version 1.0
 */
public class RectangleDemo {

    public static void main(String[] args) {

        //创建Rectangle对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
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
