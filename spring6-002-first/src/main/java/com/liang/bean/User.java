package com.liang.bean;

/**
 * 这是一个Bean，封装了用户的信息，spring可以帮助我们创建User对象吗？
 *
 * @author zl
 * @date 2022/11/28 0:13
 */
public class User {
    // spring是怎么实例化对象的
    // 默认情况下spring会通过反射机制，调用类的无参构造方法来实例化对象。
    // Class clazz = Class.forName("com.liang.bean.User");
    // Object obj = clazz.newInstance();
    //
    //

    public User () {
        System.out.println("User无参构造方法调用。");
    }

    public User (String str) {
        
        System.out.println("User无参构造方法调用。");
    }

}
