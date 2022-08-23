package com.w.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class StudentIteratorImpl implements IStudentIterator{

    //聚合Student
    private List<Student> list;
    //遍历指针所在位置
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
