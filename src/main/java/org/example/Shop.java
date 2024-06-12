package org.example;

import org.example.entite.Product;
import org.example.exception.NotImplementedException;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
    }

    public void update(Product product) {
        product.setQuality(product.getQuality() - 1);
        product.setSellIn(product.getSellIn() - 1);
    }
}