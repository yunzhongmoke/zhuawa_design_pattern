package com.w.framework.context.support;

import com.w.framework.beans.BeanDefinition;
import com.w.framework.beans.MultiplePropertyValue;
import com.w.framework.beans.factory.support.BeanDefinitionRegistry;
import com.w.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.w.framework.utils.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author blue
 * @version 1.0
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //初始化BeanDefinitionReader
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        //调用refresh()
        try {
            refresh();
        } catch (Exception e) {

        }
    }

    @Override
    public Object getBean(String beanName) throws Exception {

        //判断bean是否存在
        Object object = singletonObjects.get(beanName);
        if (object != null) {
            return object;
        }

        //获取注册表
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        //获取BeanDefinition对象
        BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
        //判断是否存在BeanDefinition对象
        if (beanDefinition == null) {
            return null;
        }

        String className = beanDefinition.getClassName();
        //反射获取字节码对象
        Class<?> clazz = Class.forName(className);
        //实例化对象
        Object beanObject = clazz.getDeclaredConstructor().newInstance();
        //获取MultipleProperValue对象
        MultiplePropertyValue propertyValues = beanDefinition.getPropertyValues();
        //遍历
        propertyValues.forEach(propertyValue -> {
            String propertyName = propertyValue.getName();
            String ref = propertyValue.getRef();
            String value = propertyValue.getValue();
            //依赖注入
            //判断ref
            if (ref != null && !"".equals(ref)) {
                try {
                    //获取bean对象
                    Object bean = this.getBean(ref);
                    //获取方法名称
                    String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                    //获取所有method对象
                    Method[] methods = clazz.getMethods();
                    //遍历methods
                    Arrays.stream(methods).forEach(method -> {
                        //找出方法名对应的method对象
                        if (method.getName().equals(methodName)) {
                            try {
                                //调用方法
                                method.invoke(beanObject, bean);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //判断value
            if (value != null && !"".equals(value)) {
                //获取方法名称
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                try {
                    //获取method对象
                    Method methodObject = clazz.getMethod(methodName, String.class);
                    //调用方法
                    methodObject.invoke(beanObject, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //加入至singletonObjects集合中
        singletonObjects.put(beanName, beanObject);
        return beanObject;
    }

    @Override
    public <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception {
        Object bean = this.getBean(beanName);
        if (bean != null) {
            return clazz.cast(bean);
        }

        return null;
    }
}
