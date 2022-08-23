package com.w.pattern.builder.example;

/**
 * @author blue
 * @version 1.0
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金Ofo");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶Ofo");
    }
}
