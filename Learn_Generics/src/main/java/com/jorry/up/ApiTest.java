package com.jorry.up;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:44
 * @Describe: 类的描述信息
 * Drink ->Juice->AppleJuice
 */
public class ApiTest {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice = new AppleJuice();
    }
}
