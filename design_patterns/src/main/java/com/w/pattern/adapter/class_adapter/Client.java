package com.w.pattern.adapter.class_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.readSDCard(new SDCardImpl());

        //创建适配器
        TFAdapterSD tfAdapterSD = new TFAdapterSD();
        computer.readSDCard(tfAdapterSD);
    }
}
