package com.liang.test;

import com.liang.dao.UserDao;
import com.liang.service.CustomerService;
import com.liang.service.OrderService;
import com.liang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/12/1 21:33
 */
public class SpringDITest {

    @Test
    public void testOrderDI(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("set-di.xml");
        // 引入外部bean
        OrderService orderService = ac.getBean("orderServiceBean", OrderService.class);
        orderService.generate();

        // 引入内部bean
        OrderService orderService2 = ac.getBean("orderServiceBean2", OrderService.class);
        orderService2.generate();
    }

    @Test
    public void testCustomerDI(){
        // 测试 构造方法注入
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        // 下标
        CustomerService csBean = ac.getBean("csBean", CustomerService.class);
        csBean.save();

        // name
        CustomerService csBean2 = ac.getBean("csBean2", CustomerService.class);
        csBean2.save();

        // 类型
        CustomerService csBean3 = ac.getBean("csBean3", CustomerService.class);
        csBean3.save();
    }

    @Test
    public void testSetDI(){
        // 测试set注入
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = ac.getBean("userDaoBean", UserDao.class);
        System.out.println(userDao);

        UserService userService = ac.getBean("userServiceBean", UserService.class);
        System.out.println(userService);

        userService.insert();
        userService.insertVip();
    }
}
