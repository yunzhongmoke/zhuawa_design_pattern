package com.w.pattern.prototype.example;

import jdk.nashorn.internal.ir.debug.JSONWriter;

/**
 * @author blue
 * @version 1.0
 */
public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //浅克隆
        Citation citation = new Citation();
        Student student = new Student();
        citation.setStudent(student);
        Citation citation1 = citation.clone();
        citation.getStudent().setName("张三");
        citation1.getStudent().setName("李四");
        citation.show();
        citation1.show();
    }
}
