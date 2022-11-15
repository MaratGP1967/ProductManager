package ru.netology.ProductManager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {
    Smartphone phone = new Smartphone(1, "Phone 1", 100, "Nokia");

    @Test
    public void matchesProductTest() {

        boolean expected = true;
        boolean actual = phone.matches("Phone 1");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesSmartphoneTest() {

        boolean expected = true;
        boolean actual = phone.matches("Nokia");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesNotTestTest() {

        boolean expected = false;
        boolean actual = phone.matches("Product");

        Assertions.assertEquals(expected, actual);
    }

}
