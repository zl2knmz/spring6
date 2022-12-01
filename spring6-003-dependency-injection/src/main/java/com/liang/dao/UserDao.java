package com.liang.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zl
 * @date 2022/12/1 21:24
 */
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        logger.info("数据库正在保存用户信息。");
    }
}
