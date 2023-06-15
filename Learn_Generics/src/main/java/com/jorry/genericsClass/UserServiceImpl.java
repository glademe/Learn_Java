package com.jorry.genericsClass;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:08
 * @Describe: 类的描述信息
 */
public class UserServiceImpl {

    public static void main(String[] args) {

        //匿名内部类
        new UserService<User>() {

            @Override
            public User queryUser() {
                return null;
            }
        };
    }


    static class User {
        private String name;

        private Integer age;

        private String realName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }
}
