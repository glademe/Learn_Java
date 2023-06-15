package com.jorry.genericsClass;

/**
 * 在类名之后使用尖括号声明类型参数，
 * 声明的类型参数可以像普通类型一样用在类型声明处使用，
 * 到使用时再决定其具体类型，然后编译器会帮我们处理一些类型类型转换的细节。
 *
 * @author :Jorry
 * @date : 2023-06-15 22:58
 * @Describe: 泛型类
 */
public class Holder<T> {
    T val;

    public Holder() {
    }

    public Holder(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }


    static class Apple {
        public void show() {
            System.out.println(getClass().getSimpleName());
        }
    }

    static class AppleHolder extends Holder<Apple> {
        public AppleHolder(Apple apple) {
            super(apple);
        }

    }


    public static void main(String[] args) {
//        Holder<Integer> holder = new Holder<>();
//        holder.setVal(18);
//        Integer val = holder.getVal();
//        System.out.println("val = " + val);

        AppleHolder appleHolder = new AppleHolder(new Apple());
        Apple apple = appleHolder.getVal();
        apple.show();

    }
}
