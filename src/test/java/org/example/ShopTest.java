package org.example;

import org.example.entite.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    private Product product = null;
    private Shop shop = null ;
    @Before
    public void setUp() {
       this.product = new Product("Normal", "product", 10, 20);
       this.shop = new Shop();
    }

    @After
    public void tearDown() {
        product = null;
        shop = null;
    }

    @Test
    public void if_update_decrement_sellIn() {
        int sellInBeforeUpdate = product.getSellIn();
        shop.update(product);
        Assert.assertTrue(product.getSellIn() < sellInBeforeUpdate);
    }

    @Test
    public void if_update_decrement_quality() {
        int qualityBeforeUpdate = product.getQuality();
        shop.update(product);
        Assert.assertTrue(product.getSellIn() < qualityBeforeUpdate);
    }

    @Test
    public void when_sellInO_then_quality_decrement_faster() {
        product.setSellIn(0);
        int qualityBeforeUpdate = product.getQuality();
        shop.update(product);
        Assert.assertTrue(product.getQuality() == qualityBeforeUpdate - 2);
    }

    @Test
    public void quality_never_negative() {
        product.setQuality(0);
        shop.update(product);
        Assert.assertTrue(product.getQuality() >= 0);
    }

    @Test
    public void quality_is_never_more_than_50() {
        int expected = 50;
        product.setQuality(55);
        int result = product.getQuality();
        shop.update(product);
        Assert.assertEquals(result, expected);
    }
}
