package com.liang.spring6.web;

import com.liang.spring6.service.UserService;
import com.liang.spring6.service.impl.UserServiceImpl;

/**
 * @author zl
 * @date 2022/11/24 0:12
 */
public class UserAction {
//    private UserService userService = new UserServiceImpl();

    private UserService userService;

    public void deleteUserRequest(){
        userService.deleteUser();
    }

}
