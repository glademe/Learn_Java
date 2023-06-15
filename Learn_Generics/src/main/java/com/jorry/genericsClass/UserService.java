package com.jorry.genericsClass;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:07
 * @Describe: 泛型接口
 */
public interface UserService<T> {

    T queryUser();
}
