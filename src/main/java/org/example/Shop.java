package org.example;

import org.example.entite.Product;
import org.example.exception.NotImplementedException;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }
}