package com.company;

public abstract class Drink {
    String name, description;
    Integer price;

    public Drink(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " + name + '\n' +
                "\tОписание: " + description + '\n' +
                "\tЦена: " + price;
    }
}
