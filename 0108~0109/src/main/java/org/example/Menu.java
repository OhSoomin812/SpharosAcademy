package org.example;

public class Menu {

    String name;
    int price;
    String size; // 소, 대

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Menu(String name, int price, String size) {

    }
}
