package com.w.principles.demo04_interface_isolation;

/**
 * @author blue
 * @version 1.0
 */
public class IngEmergencyDoor implements IAntiTheft, IFireproof, IWaterproof{
    @Override
    public void antiTheft() {
        System.out.println("anti theft");
    }

    @Override
    public void fireproof() {
        System.out.println("fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("waterproof");
    }
}
