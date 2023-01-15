package com.liang.test;

import com.liang.bean.Clazz;
import com.liang.bean.SimpleValueType;
import com.liang.bean.Student;
import com.liang.bean.User;
import com.liang.dao.UserDao;
import com.liang.jdbc.MyDataSource;
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

        // 基本数据类型
        User userBean = ac.getBean("userBean", User.class);
        System.out.println(userBean);
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

    @Test
    public void testSimpleValueTypeSet(){
        // 测试set注入
        ApplicationContext ac = new ClassPathXmlApplicationContext("set-di.xml");
        SimpleValueType simpleValueType = ac.getBean("svt", SimpleValueType.class);
        System.out.println(simpleValueType);

    }

    @Test
    public void testMyDataSource(){
        // 简单使用
        ApplicationContext ac = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = ac.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

    }

    @Test
    public void testCascade(){
        // 简单使用
        ApplicationContext ac = new ClassPathXmlApplicationContext("cascade.xml");
        Student student = ac.getBean("studentBean", Student.class);
        System.out.println(student);

        Clazz clazz = ac.getBean("clazzBean", Clazz.class);
        System.out.println(clazz);

    }
}
