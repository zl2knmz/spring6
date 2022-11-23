package com.liang.spring6.service.impl;

import com.liang.spring6.dao.UserDao;
import com.liang.spring6.dao.impl.UserDaoImplForMySQL;
import com.liang.spring6.service.UserService;

/**
 * @author zl
 * @date 2022/11/24 0:16
 */
public class UserServiceImpl implements UserService {

    @Override
    public void deleteUser() {
        UserDao userDao = new UserDaoImplForMySQL();
        userDao.deleteById();
        System.out.println("删除用户");
    }
}
