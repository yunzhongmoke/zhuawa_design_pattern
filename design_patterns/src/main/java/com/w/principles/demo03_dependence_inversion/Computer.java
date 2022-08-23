package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 */
public class Computer {

    private ICpu cpu;
    private IMemory memory;
    private IHardDisk hardDisk;

    //运行computer的方法
    public void run() {

        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = hardDisk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }

    public ICpu getCpu() {
        return cpu;
    }

    public void setCpu(ICpu cpu) {
        this.cpu = cpu;
    }

    public IMemory getMemory() {
        return memory;
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }

    public IHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(IHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
