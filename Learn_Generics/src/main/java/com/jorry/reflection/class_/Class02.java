package com.jorry.reflection.class_;

import com.jorry.reflection.domain.Car;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author :Jorry
 * @date : 2023-08-09 20:43
 * @Describe: 类的描述信息
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classPath = "com.jorry.reflection.domain.Car";
        Class<?> aClass = Class.forName(classPath);
        //输出Class
        System.out.println(aClass.getClass());
        //得到包名
        System.out.println(aClass.getPackage().getName());
        //得到类名
        System.out.println(aClass.getName());

        //创建对象实例
        Car o = (Car) aClass.newInstance();

        System.out.println("o = " + o);

        //通过反射获取所有的属性
        Field[] fields = aClass.getFields();
        List<Field> list = Arrays.asList(fields);
        list.forEach(field -> field.setAccessible(true));
        Field fieldName = aClass.getField("name");
        System.out.println("fieldName = " + fieldName);

        //通过反射给属性设置值
        fieldName.set(o, "zhangsan");
        System.out.println(fieldName.get(o));
    }
}
