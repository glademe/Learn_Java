package com.jorry.up;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:43
 * @Describe: 类的描述信息
 */
public class Bottle<T> {

    private T drink;

    public Bottle(T drink) {
        this.drink = drink;
    }

    public T getDrink() {
        return drink;
    }

    public void setDrink(T drink) {
        this.drink = drink;
    }
}
