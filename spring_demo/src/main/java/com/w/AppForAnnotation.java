package com.w;

import com.w.framework.context.ApplicationContext;
import com.w.framework.context.support.ClassPathXmlApplicationContext;
import com.w.service.IUserService;
import com.w.service.impl.UserServiceImpl;

/**
 * @author blue
 * @version 1.0
 */
public class AppForAnnotation {

    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        userService.add();
    }
}
