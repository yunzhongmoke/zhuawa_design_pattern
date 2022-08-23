package com.w.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class StudentAggregateImpl implements IStudentAggregate{

    //聚合Student
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public IStudentIterator getIterator() {
        return new StudentIteratorImpl(list);
    }
}
