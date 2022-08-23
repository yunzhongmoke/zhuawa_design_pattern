package com.w.pattern.adapter.class_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class TFAdapterSD extends TFCardImpl implements ISDCard {

    @Override
    public void readSD() {
        readTF();
    }

    @Override
    public String writeSD(String message) {
        return writeTF(message);
    }
}
