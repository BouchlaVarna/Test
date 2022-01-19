package cz.app.modules;

import cz.app.enums.EMaso;

import java.util.ArrayList;

public class Maso extends Product{
    private ArrayList<Product> products = new ArrayList<>();

    public Maso() {
        for (int i = 0; i < EMaso.values().length; i++) {
            products.add(EMaso.values()[i].getProduct());
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
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }
}
