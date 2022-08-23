package com.w.principles.demo03_dependence_inversion;

/**
 * @author blue
 * @version 1.0
 */
public interface IHardDisk {

    //保存数据的方法
    public abstract void save(String data);

    //获取数据的方法
    public abstract String get();
}
