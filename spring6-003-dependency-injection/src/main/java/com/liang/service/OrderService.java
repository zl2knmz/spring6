package com.liang.service;

import com.liang.dao.OrderDao;

/**
 * @author zl
 * @date 2022/12/1 22:56
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }

}
