package com.jorry.genericsMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:15
 * @Describe: 泛型方法
 */
public class Test {


    /**
     * 静态泛型方法
     *
     * @param x
     * @param <T>
     */
    public static <T> void t(T x) {
        System.out.println(x.getClass().getName());
    }

    public static <K, V> Map<K, V> newMap() {
        return new HashMap<K, V>();
    }

    public static <T> String className(T t) {
        return t.getClass().getSimpleName();
    }

    public static <T> List<T> toList(T... args) {
        ArrayList<T> ts = new ArrayList<>(args.length);
        for (T arg : args) {
            ts.add(arg);
        }

        return ts;
    }

    public static void main(String[] args) {
//        t(1L);
//        t("abc");
//
//        Map<String, Integer> map = newMap();
//        map.put("张三", 1);
//        System.out.println("map = " + map);

//        System.out.println(Test.className(1));

        System.out.println(toList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
