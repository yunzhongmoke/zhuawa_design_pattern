package com.w.framework.context;

import com.w.framework.beans.factory.BeanFactory;

/**
 * @author blue
 * @version 1.0
 */
public interface ApplicationContext extends BeanFactory {

    //进行配置文件加载并进行对象创建
    void refresh() throws IllegalStateException, Exception;
}
