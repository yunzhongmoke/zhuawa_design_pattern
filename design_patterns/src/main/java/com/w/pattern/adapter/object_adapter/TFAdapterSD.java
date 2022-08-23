package com.w.pattern.adapter.object_adapter;

/**
 * @author blue
 * @version 1.0
 */
public class TFAdapterSD implements ISDCard {

    //定义ITFCard对象
    private ITFCard tfCard;

    public void setTfCard(ITFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void readSD() {
        tfCard.readTF();
    }

    @Override
    public String writeSD(String message) {
        return tfCard.writeTF(message);
    }
}
