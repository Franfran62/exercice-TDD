package org.example;

import org.example.entite.Product;
import org.example.exception.NotImplementedException;

import java.util.List;
import java.util.Objects;

public class Shop {
    private List<Product> products;

    public Shop() {
    }

    public void update(Product product) {
        if (product.getSellIn() == 0 || Objects.equals(product.getType(), "laitier")) {
            product.setQuality(product.getQuality() - 2);
            return;
        }
        product.setSellIn(product.getSellIn() - 1);

        if (!Objects.equals(product.getName(), "brie vieilli")) {
            product.setQuality(product.getQuality() - 1);
            return;
        }
        product.setQuality(product.getQuality() + 1);

    }
}