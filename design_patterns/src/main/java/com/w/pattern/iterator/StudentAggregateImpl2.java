package com.w.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class StudentAggregateImpl2 implements Iterable<Student>{

    //聚合Student
    private List<Student> list = new ArrayList<>();

    public void addStudent(Student student) {
        list.add(student);
    }

    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return list.iterator();
    }
}
