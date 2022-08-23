package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 */
public class WesternDigitalHardDisk implements IHardDisk{
    @Override
    public void save(String data) {
        System.out.println("使用WesternDigital存储数据" + data);
    }

    @Override
    public String get() {
        System.out.println("使用WesternDigital硬盘取数据");
        return "数据";
    }
}
