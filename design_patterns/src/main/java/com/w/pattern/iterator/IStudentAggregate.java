package com.w.pattern.iterator;

/**
 * @author blue
 * @version 1.0
 */
public interface IStudentAggregate {

    //添加元素
    void addStudent(Student student);

    //删除元素
    void removeStudent(Student student);

    //获取迭代器
    IStudentIterator getIterator();
}
