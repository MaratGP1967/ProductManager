package ru.netology.ProductManager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book(1, "Book 1", 100, "Автор 1");

    @Test
    public void matchesProductTest() {

        boolean expected = true;
        boolean actual = book.matches("Book 1");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesBookTest() {

        boolean expected = true;
        boolean actual = book.matches("Автор 1");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesNotBookTest() {

        boolean expected = false;
        boolean actual = book.matches("Product");

        Assertions.assertEquals(expected, actual);
    }

}
