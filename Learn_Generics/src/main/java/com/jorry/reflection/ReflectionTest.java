package com.jorry.reflection;

import cn.hutool.core.util.ReflectUtil;
import com.jorry.reflection.domain.Teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author :Jorry
 * @date : 2023-08-09 22:18
 * @Describe: 类的描述信息
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类的对象
        Class<?> aClass = Class.forName("com.jorry.reflection.domain.Teacher");
        //创建对象实例
        Teacher teacher = (Teacher) ReflectUtil.newInstance(aClass);

        Field[] fields = ReflectUtil.getFields(aClass);
        //修改属性值
        ReflectUtil.setFieldValue(teacher,"name","jorry");
        ReflectUtil.setFieldValue(teacher,"age",18);
        ReflectUtil.setFieldValue(teacher,"height",1.88);

        //执行里面的方法
        ReflectUtil.invoke(teacher,"teachBook");

        System.out.println(teacher);

        Method[] methods = ReflectUtil.getMethods(Teacher.class);
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
    }
}
