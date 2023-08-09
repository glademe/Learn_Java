package com.jorry.reflection.domain;

/**
 * @author :Jorry
 * @date : 2023-08-09 18:50
 * @Describe: 类的描述信息
 */
public class Dog {
    public String name;

    private String color;




    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void run() {
        System.out.println("狗奔跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
