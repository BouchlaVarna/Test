package cz.app.modules;

import java.util.ArrayList;

public class Product {
    private String name;
    private int amount = 0;
    private int price = 10;

    public Product(String name) {
        this.name = name;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return this.price * this.amount;
    }

    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", Amount: " + amount +
                ", Price: " + price;
    }
}
