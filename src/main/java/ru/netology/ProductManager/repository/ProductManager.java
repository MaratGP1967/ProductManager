package ru.netology.ProductManager.repository;

import ru.netology.ProductManager.domain.Product;

public class ProductManager {
    private ProductRepository productList;

    public ProductManager(ProductRepository productList) {
        this.productList = productList;
    }

    public void add(Product product) {
        productList.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : productList.findAll()) {
            if (product.matches(text)) {
                // "добавляем в конец" массива result продукт product
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public Product[] allProduct() {
        return productList.findAll();
    }

}

