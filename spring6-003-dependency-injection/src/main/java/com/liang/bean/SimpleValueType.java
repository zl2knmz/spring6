package com.liang.bean;

import org.springframework.util.ClassUtils;

import java.net.URI;
import java.net.URL;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;

/**
 * @author zl
 * @date 2022/12/6 22:52
 */
public class SimpleValueType {
    private int age;
    private Integer age2;

    private boolean flag;
    private boolean flag2;

    private char c;
    private Character c2;

    private Season season;

    private String userName;
    private Class clazz;

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFlag2(boolean flag2) {
        this.flag2 = flag2;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "age=" + age +
                ", age2=" + age2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", c=" + c +
                ", c2=" + c2 +
                ", season=" + season +
                ", userName='" + userName + '\'' +
                ", clazz=" + clazz +
                ", date=" + date +
                '}';
    }

    public static boolean isSimpleValueType(Class<?> type) {
        return Void.class != type && Void.TYPE != type && (
                ClassUtils.isPrimitiveOrWrapper(type) ||
                        Enum.class.isAssignableFrom(type) ||
                        CharSequence.class.isAssignableFrom(type) ||
                        Number.class.isAssignableFrom(type) ||
                        // java.util.Date
                        Date.class.isAssignableFrom(type) ||
                        // java8 提供的时间和时区类
                        Temporal.class.isAssignableFrom(type) ||
                        URI.class == type ||
                        URL.class == type ||
                        // Locale是语言类，也是简单类型
                        Locale.class == type ||
                        Class.class == type);
    }

//    public enum Season {
//        SPRING,
//        SUMMER,
//        AUTUMN,
//        WINTER
//    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
