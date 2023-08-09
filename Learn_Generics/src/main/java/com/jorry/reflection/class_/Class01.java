package com.jorry.reflection.class_;

import com.jorry.reflection.domain.Dog;

/**
 * @author :Jorry
 * @date : 2023-08-09 20:28
 * @Describe: 类的描述信息
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类对象不是new出来的，而是系统生成的
        Dog dog = new Dog();

        //反射方式
        Class<?> aClass = Class.forName("com.jorry.reflection.domain.Dog");
    }
}
