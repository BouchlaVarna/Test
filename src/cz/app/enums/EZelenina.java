package cz.app.enums;

import cz.app.modules.Product;

public enum EZelenina {
    BRAMBORY(new Product("Brambory")),
    MRKEV(new Product("Mrkev")),
    POREK(new Product("Porek"));

    private Product product;

    EZelenina(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
