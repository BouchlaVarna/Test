package cz.app.modules;

import cz.app.enums.EOvoce;
import cz.app.enums.EZelenina;

import java.util.ArrayList;

public class Ovoce extends Product{
    private ArrayList<Product> products = new ArrayList<>();

    public Ovoce() {
        for (int i = 0; i < EOvoce.values().length; i++) {
            products.add(EOvoce.values()[i].getProduct());
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getTotalAmount() {
        int totalAmount = 0;
        for (Product product : this.products) {
            totalAmount += product.getAmount();
        }
        return totalAmount;
    }

    public int getTotalPriceOfProducts() {
        int totalPrice = 0;
        for (Product product : this.products) {
            totalPrice = product.getTotalPrice();
        }
        return totalPrice;
    }
}
