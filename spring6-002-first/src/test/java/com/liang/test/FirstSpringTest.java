package com.liang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/11/28 23:07
 */
public class FirstSpringTest {

    @Test
    public void testFirstSpringCode(){

        // 第一步：获取Spring容器对象
        // ApplicationContext 翻译为：应用上下文，其实就是SPring容器。
        // ApplicationContext 是一个接口。
        // ApplicationContext 接口下有很多实现类，其中有一个实现类叫做：ClassPathXmlApplicationContext
        // ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个spring上下文对象。
        // 这行代码只要执行，就相当于启动了spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器中。
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring配置文件的路径");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 第二步：根据bean的id从spring容器中获取这个对象。
        Object userBean = applicationContext.getBean("userBean");

        System.out.println(userBean.getClass().getName());
    }




}
