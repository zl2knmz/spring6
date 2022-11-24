package com.liang.spring6.service.impl;

import com.liang.spring6.dao.UserDao;
import com.liang.spring6.dao.impl.UserDaoImplForMySQL;
import com.liang.spring6.dao.impl.UserDaoImplForOracle;
import com.liang.spring6.service.UserService;

/**
 * @author zl
 * @date 2022/11/24 0:16
 */
public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImplForMySQL();

    //修改为
//    private UserDao userDao = new UserDaoImplForOracle();

    private UserDao userDao;

    /**set注入*/
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**构造注入*/
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void deleteUser() {
        userDao.deleteById();
        System.out.println("删除用户,service层");
    }
}
