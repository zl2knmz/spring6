package com.liang.service;

import com.liang.dao.UserDao;
import com.liang.dao.VipDao;

/**
 * @author zl
 * @date 2022/12/1 22:38
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save() {
        userDao.insert();
        vipDao.insert();
    }
}
