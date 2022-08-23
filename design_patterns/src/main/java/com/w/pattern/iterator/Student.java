package com.w.pattern.iterator;

/**
 * @author blue
 * @version 1.0
 */
public class Student {

    private String name;
    private String student_no;

    public Student(String name, String student_no) {
        this.name = name;
        this.student_no = student_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", student_no='" + student_no + '\'' +
                '}';
    }
}
