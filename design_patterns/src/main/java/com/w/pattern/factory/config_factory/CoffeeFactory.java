package com.w.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author blue
 * @version 1.0
 */
public class CoffeeFactory {

    //创建集合，用于存储对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    static {
        //读取配置文件
        ResourceBundle bean = ResourceBundle.getBundle("bean");
//        //创建Properties对象
//        Properties bean = new Properties();
//        //获取输入流
//        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
//        //加载配置文件
//        try {
//            bean.load(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //遍历bean
//        bean.keySet().forEach(key -> {
//            //获取全类名
//            String className = bean.getString(key);
////            String className = bean.getProperty((String) key);
//            //反射
//            try {
//                //获取字节码(Class)对象
//                Class<?> clazz = Class.forName(className);
//                //实例化对象
//                Coffee coffee = (Coffee) clazz.newInstance();
//                //将其存入map集合中
//                map.put(/*(String)*/ key, coffee);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
        for (String key : bean.keySet()) {
            //获取全类名
            String className = bean.getString(key);
//            String className = bean.getProperty((String) key);
            //反射
            try {
                //获取字节码(Class)对象
                Class<?> clazz = Class.forName(className);
                //实例化对象
                Coffee coffee = (Coffee) clazz.newInstance();
                //将其存入map集合中
                map.put(/*(String)*/ key, coffee);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //生产coffee
    public static Coffee createCoffee(String name) {

        return map.get(name);
    }
}
