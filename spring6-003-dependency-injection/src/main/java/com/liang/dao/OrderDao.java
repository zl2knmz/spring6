package com.liang.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zl
 * @date 2022/12/1 22:55
 */
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void insert() {
        logger.info("订单生成。");
    }
}
