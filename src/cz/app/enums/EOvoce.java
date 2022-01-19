package cz.app.enums;

import cz.app.modules.Product;

public enum EOvoce {
    JABLKO(new Product("Jablko")),
    HRUSKA(new Product("Hruska")),
    JAHODY(new Product("Jahody"));

    private Product product;

    EOvoce(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
