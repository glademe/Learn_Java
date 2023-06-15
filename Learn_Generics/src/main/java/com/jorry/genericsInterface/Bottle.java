package com.jorry.genericsInterface;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:12
 * @Describe: 类的描述信息
 */
public interface Bottle<T> {
    void pourInto(T t);

    T pourOut();
}
