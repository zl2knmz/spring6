package com.liang.service;

import com.liang.dao.UserDao;
import com.liang.dao.VipDao;

/**
 * @author zl
 * @date 2022/12/1 21:29
 */

public class UserService {
    private UserDao userDao;

    private VipDao vipDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insert() {
        userDao.insert();
        System.out.println("数据库正在保存用户信息。");
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void insertVip() {
        vipDao.insert();
        System.out.println("数据库正在保存vip信息。");
    }
}
