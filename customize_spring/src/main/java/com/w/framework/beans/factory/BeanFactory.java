package com.w.framework.beans.factory;

/**
 * @author blue
 * @version 1.0
 */
public interface BeanFactory {

    //根据bean的名称获取bean对象
    Object getBean(String beanName) throws Exception;
    //根据bean的名称和类型获取bean对象
    <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception;
}
