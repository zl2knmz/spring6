package com.liang.bean;

/**
 * @author zl
 * @date 2023/1/15 22:57
 */
public class Student {
    private String name;

    private Clazz clazz;

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    /**
     * 使用级联属性赋值,必须提供get方法
     */
    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
