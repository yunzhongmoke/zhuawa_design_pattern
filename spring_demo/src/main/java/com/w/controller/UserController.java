package com.w.controller;

import com.w.service.IUserService;

/**
 * @author blue
 * @version 1.0
 */
public class UserController {

    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
