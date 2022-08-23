package com.w.pattern.flyweight;

import java.util.HashMap;

/**
 * @author blue
 * @version 1.0
 */
public class BoxFactory {

    //聚合AbstractBox
    private HashMap<String, AbstractBox> map;

    //创建BoxFactory对象
    private static BoxFactory boxFactory = new BoxFactory();

    //私有构造器，单例模式
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    //获取BoxFactory实例化对象
    public static BoxFactory getInstance() {
        return boxFactory;
    }

    //获取Box
    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
