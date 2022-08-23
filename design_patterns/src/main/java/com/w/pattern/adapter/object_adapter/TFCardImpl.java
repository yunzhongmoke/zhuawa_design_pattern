package com.w.pattern.adapter.object_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class TFCardImpl implements ITFCard {
    @Override
    public void readTF() {
        System.out.println("TF card read");
    }

    @Override
    public String writeTF(String message) {
        return "TF card write : " + message;
    }
}
