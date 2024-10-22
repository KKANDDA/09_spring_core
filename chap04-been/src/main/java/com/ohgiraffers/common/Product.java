package com.ohgiraffers.common;

public abstract class Product { // abstract 추상 클래스 이것을 상속 받으면 이하의 것들을 공통적으로 사용할 수 있다. 얘는 암 것도 없지만..

    private String name; // 상품명
    private int price; // 가격

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
