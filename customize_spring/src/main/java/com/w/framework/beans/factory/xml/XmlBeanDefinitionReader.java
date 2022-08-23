package com.w.framework.beans.factory.xml;

import com.w.framework.beans.BeanDefinition;
import com.w.framework.beans.MultiplePropertyValue;
import com.w.framework.beans.PropertyValue;
import com.w.framework.beans.factory.support.BeanDefinitionReader;
import com.w.framework.beans.factory.support.BeanDefinitionRegistry;
import com.w.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    //定义BeanDefinitionRegistry
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {

        //获取文件输入流
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        //创建SAXReader对象
        SAXReader saxReader = new SAXReader();
        //读取文件
        Document document = saxReader.read(inputStream);
        //获取根标签(即beans标签)
        Element rootElement = document.getRootElement();
        //解析beans标签内的bean标签
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {

        //获取子标签
        List<Element> elements = rootElement.elements();
        //遍历子标签
        elements.forEach(element -> {
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");
            //创建BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            //获取子标签
            List<Element> propertyList = element.elements("property");
            //创建MultiplePropertyValue对象
            MultiplePropertyValue propertyValues = new MultiplePropertyValue();
            //遍历
            propertyList.forEach(property -> {
                String name = property.attributeValue("name");
                String ref = property.attributeValue("ref");
                String value = property.attributeValue("value");
                //创建PropertyValue对象
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                //加入propertyValues
                propertyValues.addPropertyValue(propertyValue);
            });
            //将MultiplePropertyValue对象加入BeanDefinition中
            beanDefinition.setPropertyValues(propertyValues);
            //加入注册表中
            registry.registerBeanDefinition(id, beanDefinition);
        });
    }
}
