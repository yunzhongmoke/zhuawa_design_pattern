package com.w.pattern.adapter.object_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class SDCardImpl implements ISDCard {
    @Override
    public void readSD() {
        System.out.println("SD card read");
    }

    @Override
    public String writeSD(String message) {
        return "SD card write : " + message;
    }
}
