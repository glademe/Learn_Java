package com.jorry.reflection.domain;

/**
 * @author :Jorry
 * @date : 2023-08-09 20:42
 * @Describe: 类的描述信息
 */
public class Car {

    public String name;

    private int price;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
