package com.jorry.hutool;

import cn.hutool.core.util.ReflectUtil;
import com.jorry.genericsClass.User;
import com.jorry.reflection.domain.Dog;

import java.lang.reflect.Field;

/**
 * @author :Jorry
 * @date : 2023-08-09 21:37
 * @Describe: 类的描述信息
 */
public class ReflectionUtil {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person();
        ReflectUtil.setFieldValue(person, "name", "zhangsan");
        ReflectUtil.setFieldValue(person, "age", 18);
        String name = (String) ReflectUtil.getFieldValue(person, "name");
        Integer age = (Integer) ReflectUtil.getFieldValue(person, "age");
        System.out.println(name);
        System.out.println(age);

        //获取所有属性
        Field[] fields = ReflectUtil.getFields(Person.class);
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Person person1 = ReflectUtil.newInstance(Person.class, "zhangsan", 18);
        System.out.println("person1 = " + person1);

        ReflectUtil.invoke(person,"eat");
    }
}

class Person {
    private String name;

    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("我要吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}