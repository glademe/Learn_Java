package com.jorry.reflection.domain;

/**
 * @author :Jorry
 * @date : 2023-08-09 22:17
 * @Describe: 类的描述信息
 */
public class Teacher {
    private String name;

    private Integer age;

    protected double height;


    private void teachBook(){
        System.out.println("老师教书");
    }
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
