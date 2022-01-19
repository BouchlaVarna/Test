package cz.app.modules;

import cz.app.enums.EMaso;
import cz.app.enums.EZelenina;

import java.util.ArrayList;

public class Zelenina extends Product{
    private ArrayList<Product> products = new ArrayList<>();

    public Zelenina() {
        for (int i = 0; i < EZelenina.values().length; i++) {
            products.add(EZelenina.values()[i].getProduct());
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
