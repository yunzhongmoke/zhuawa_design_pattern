package com.w.pattern.builder.example02;

/**
 * @author blue
 * @version 1.0
 */
public class PhoneTest {

    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .cpu("海思麒麟")
                .memory("国产内存")
                .screen("京东方")
                .mainboard("组装主板")
                .builder();

        System.out.println(phone);
    }
}
