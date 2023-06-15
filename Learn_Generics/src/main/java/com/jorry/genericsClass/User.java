package com.jorry.genericsClass;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:03
 * @Describe: 类的描述信息
 */
public class User<A, B, C> {
    public A v1;

    public B v2;

    public C v3;

    public User(A v1, B v2, C v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public A getV1() {
        return v1;
    }

    public void setV1(A v1) {
        this.v1 = v1;
    }

    public B getV2() {
        return v2;
    }

    public void setV2(B v2) {
        this.v2 = v2;
    }

    public C getV3() {
        return v3;
    }

    public void setV3(C v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "User{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public static void main(String[] args) {
        User<String,Integer,Double> user = new User<>("张三",18,1.88);
        System.out.println("user = " + user);
    }
}
