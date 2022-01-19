package cz.app.enums;

import cz.app.modules.Product;

public enum EMaso {
    KURE(new Product("Kure")),
    STEAK(new Product("Steak")),
    SALAM(new Product("Salam"));

    private Product product;

    EMaso(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
