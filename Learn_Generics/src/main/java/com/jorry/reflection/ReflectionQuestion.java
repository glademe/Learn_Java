package com.jorry.reflection;

import com.jorry.reflection.domain.Dog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author :Jorry
 * @date : 2023-08-09 18:48
 * @Describe: 类的描述信息
 */
@SuppressWarnings("all")
public class ReflectionQuestion {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileInputStream("D:\\project\\Learn_Java\\Learn_Generics\\src\\main\\resources\\re.properties"));
        String classpath = (String) properties.get("classpath");
        String methodName = (String) properties.get("method");

        //创建对象
        //1、加载类，返回Class类型的对象clazz
        Class<?> clazz = Class.forName(classpath);
        //2、通过cla得到加载的类,获取实例
        Object o = clazz.newInstance();
        //3、得到加载类的Method
        Method method = clazz.getMethod(methodName);
        method.setAccessible(true);//取消访问检查
        //4、通过方法对象，调用方法
        method.invoke(o);


    }

    private static void m2() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileInputStream("D:\\project\\Learn_Java\\Learn_Generics\\src\\main\\resources\\re.properties"));
        String classpath = (String) properties.get("classpath");
        String methodName = (String) properties.get("method");

        //创建对象
        //1、加载类，返回Class类型的对象clazz
        Class<?> clazz = Class.forName(classpath);
        //2、通过cla得到加载的类,获取实例
        Object o = clazz.newInstance();
        //3、得到加载类的Method
        Method method = clazz.getMethod(methodName);
        //4、通过方法对象，调用方法
        method.invoke(o);


        //得到name字段
        Field nameField = clazz.getField("name");
        System.out.println(nameField.get(o));

        //获取构造器
        Constructor<?> constructor2 = clazz.getConstructor(String.class, String.class);
        Constructor<?> constructor1 = clazz.getConstructor();
    }

    private static void m1() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件，re.properties 指定信息，创建Dog对象并调用方法eat
        //使用Properties读取配置文件
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileInputStream("D:\\project\\Learn_Java\\Learn_Generics\\src\\main\\resources\\re.properties"));
        String classpath = (String) properties.get("classpath");
        String methodName = (String) properties.get("method");

        //创建对象
        //1、加载类，返回Class类型的对象clazz
        Class<?> clazz = Class.forName(classpath);
        //2、通过cla得到加载的类,获取实例
        Object o = clazz.newInstance();
        //3、得到加载类的Method
        Method method = clazz.getMethod(methodName);
        //4、通过方法对象，调用方法
        method.invoke(o);
    }
}

