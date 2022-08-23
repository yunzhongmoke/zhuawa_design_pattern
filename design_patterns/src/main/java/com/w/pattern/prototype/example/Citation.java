package com.w.pattern.prototype.example;

/**
 * @author blue
 * @version 1.0
 */
public class Citation implements Cloneable{

    private Student student;

    public Citation() {
        System.out.println("constructor");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
