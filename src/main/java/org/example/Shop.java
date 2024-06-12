package org.example;

import org.example.entite.Product;
import org.example.exception.NotImplementedException;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
    }

    public void update(Product product) {
        if (product.getSellIn() == 0) {
            product.setQuality(product.getQuality() - 2);
            return;
        }
        product.setSellIn(product.getSellIn() - 1);
        product.setQuality(product.getQuality() - 1);

    }
}