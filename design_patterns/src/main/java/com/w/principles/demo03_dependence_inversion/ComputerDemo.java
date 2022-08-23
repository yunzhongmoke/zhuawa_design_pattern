package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 * 测试类
 */
public class ComputerDemo {

    public static void main(String[] args) {

        //创建Computer类
        Computer computer = new Computer();

        ICpu cpu = new IntelCpu();
        IMemory memory = new SamSungMemory();
        IHardDisk hardDisk = new WesternDigitalHardDisk();

        //初始化computer对象
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
