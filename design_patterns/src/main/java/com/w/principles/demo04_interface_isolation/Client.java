package com.w.principles.demo04_interface_isolation;

/**
 * @author blue
 * @version 1.0
 * 客户端(测试类)
 */
public class Client {

    public static void main(String[] args) {

        IngEmergencyDoor ingEmergencyDoor = new IngEmergencyDoor();
        ingEmergencyDoor.antiTheft();
        ingEmergencyDoor.fireproof();
        ingEmergencyDoor.waterproof();
    }
}
