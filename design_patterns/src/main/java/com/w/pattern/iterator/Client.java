package com.w.pattern.iterator;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

//        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
//        studentAggregate.addStudent(new Student("q", "1"));
//        studentAggregate.addStudent(new Student("w", "2"));
//        studentAggregate.addStudent(new Student("e", "3"));
//        studentAggregate.addStudent(new Student("r", "4"));
//
//        //获取迭代器
//        IStudentIterator iterator = studentAggregate.getIterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            System.out.println(student);
//        }

        StudentAggregateImpl2 studentAggregate = new StudentAggregateImpl2();
        studentAggregate.addStudent(new Student("q", "1"));
        studentAggregate.addStudent(new Student("w", "2"));
        studentAggregate.addStudent(new Student("e", "3"));
        studentAggregate.addStudent(new Student("r", "4"));

        for (Student student : studentAggregate) {
            System.out.println(student);
        }
    }
}
