package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 */
public class SamSungMemory implements IMemory {
    @Override
    public void save() {
        System.out.println("使用samsung作为内存条");
    }
}
