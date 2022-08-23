package com.w.pattern.iterator;

/**
 * @author blue
 * @version 1.0
 */
public interface IStudentIterator {

    //判断是否有下一个元素
    boolean hasNext();

    //获取下一个元素
    Student next();
}
