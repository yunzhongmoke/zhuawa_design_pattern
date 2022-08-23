package com.w.service.impl;

import com.w.dao.IUserDao;
import com.w.service.IUserService;

/**
 * @author blue
 * @version 1.0
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
        System.out.println("service...");
    }
}
