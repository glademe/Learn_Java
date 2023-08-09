package com.jorry.reflection;

import javax.lang.model.element.NestingKind;
import java.lang.reflect.Field;

/**
 * @author :Jorry
 * @date : 2023-08-09 21:25
 * @Describe: 类的描述信息
 */
public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        api_01();
    }


    public static void api_01() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.jorry.reflection.Person");
        //得到类的全类名
        System.out.println(aClass.getName());
        //获取类的简单名字
        System.out.println(aClass.getSimpleName());

        //获取本类的所有属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

        //
    }
}

class Student extends Person {
    public String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Person {
    public String name;

    protected int age;

    String job;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;


    public void m1() {

    }

    protected void m2() {

    }

    private void m3() {

    }

    void m4() {

    }
}