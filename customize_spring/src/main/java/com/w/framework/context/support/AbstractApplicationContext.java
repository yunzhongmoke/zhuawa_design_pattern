package com.w.framework.context.support;

import com.w.framework.beans.factory.support.BeanDefinitionReader;
import com.w.framework.beans.factory.support.BeanDefinitionRegistry;
import com.w.framework.context.ApplicationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author blue
 * @version 1.0
 */
public abstract class AbstractApplicationContext implements ApplicationContext{

    //定义BeanDefinitionReader对象
    protected BeanDefinitionReader beanDefinitionReader;
    //定义一个双列集合存储bean对象
    protected Map<String, Object> singletonObjects = new HashMap<>();

    //存储配置文件路径
    protected String configLocation;

    @Override
    public void refresh() throws Exception {

        //加载beanDefinition
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化bean
        finishBeanInitialization();
    }

    //完成bean的初始化
    private void finishBeanInitialization() {

        //获取注册表
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        //获取所有bean的名称
        String[] beanNames = registry.getBeanDefinitionNames();
        //遍历beanNames，完成bean的初始化
        Arrays.stream(beanNames).forEach(beanName -> {
            try {
                getBean(beanName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
