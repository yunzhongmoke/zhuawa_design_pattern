package com.w.pattern.bridge;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        OperatingSystem system = new Windows(new AVIFile());
        system.play("啦啦啦");
    }
}
