package org.example;

import org.example.entite.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {


    @BeforeEach
    public void setUp() {
        Product product = new Product("Normal", "product", 10, 20);
        Shop shop = new Shop();
    }
    @Test
    public void if_update_decrement_sellIn(Product product, Shop shop) {
        int sellInBeforeUpdate = product.getSellIn();
        shop.update(product);
        Assert.assertTrue(product.getSellIn() < sellInBeforeUpdate);
    }

    @Test
    public void if_update_decrement_sellIn(Product product, Shop shop) {
        int qualityBeforeUpdate = product.getQuality();
        shop.update(product);
        Assert.assertTrue(product.getSellIn() < qualityBeforeUpdate);
    }
}
