package com.w.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class MultiplePropertyValue implements Iterable<PropertyValue> {

    //定义单列集合存放PropertyValue对象
    private final List<PropertyValue> propertyValueList;

    public MultiplePropertyValue() {
        this.propertyValueList = new ArrayList<>();
    }

    public MultiplePropertyValue(List<PropertyValue> propertyValues) {
        //判断传入的参数是否为空
        if (propertyValues != null) {
            this.propertyValueList = propertyValues;
        } else {
            this.propertyValueList = new ArrayList<>();
        }

//        this.propertyValues = propertyValues == null ? new ArrayList<>() : propertyValues;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

    //返回PropertyValue数组
    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[]{});
    }

    //添加PropertyValue对象
    public MultiplePropertyValue addPropertyValue(PropertyValue propertyValue) {
        //判断是否重复
        //遍历集合
        propertyValueList.stream().map(pv -> {
            if (pv.getName().equals(propertyValue.getName())) {
                pv = propertyValue;
            }
            return pv;
        });
        //没有重复，直接添加
        propertyValueList.add(propertyValue);
        return this;
    }

    //判断propertyValues是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    //根据name属性值查找PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {

        //遍历集合
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }

        return null;
    }

    //根据name属性值判断是否存在PropertyValue对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
