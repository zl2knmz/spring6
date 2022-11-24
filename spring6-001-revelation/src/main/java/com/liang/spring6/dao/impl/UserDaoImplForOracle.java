package com.liang.spring6.dao.impl;

import com.liang.spring6.dao.UserDao;

/**
 * @author zl
 * @date 2022/11/24 0:14
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("删除用户 dao层, oracle");
    }
}
