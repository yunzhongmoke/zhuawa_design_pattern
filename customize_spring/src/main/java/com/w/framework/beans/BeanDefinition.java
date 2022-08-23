package com.w.framework.beans;

/**
 * @author blue
 * @version 1.0
 */
public class BeanDefinition {

    private String id;
    private String className;

    //定义MultiplePropertyValue对象
    private MultiplePropertyValue propertyValues;

    public BeanDefinition() {
        this.propertyValues = new MultiplePropertyValue();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MultiplePropertyValue getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MultiplePropertyValue propertyValues) {
        this.propertyValues = propertyValues;
    }
}
