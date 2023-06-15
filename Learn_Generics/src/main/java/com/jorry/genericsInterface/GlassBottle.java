package com.jorry.genericsInterface;

/**
 * @author :Jorry
 * @date : 2023-06-15 23:13
 * @Describe: 类的描述信息
 */
public class GlassBottle implements Bottle<GlassBottle.Junit> {


    @Override
    public void pourInto(Junit junit) {

    }

    @Override
    public Junit pourOut() {
        return null;
    }

    static class Junit {
        private String name;

        private Double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }


        @Override
        public String toString() {
            return "Junit{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}


