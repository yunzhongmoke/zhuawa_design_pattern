package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 */
public class IntelCpu implements ICpu{
    @Override
    public void run() {
        System.out.println("intelCpu在运行");
    }
}
