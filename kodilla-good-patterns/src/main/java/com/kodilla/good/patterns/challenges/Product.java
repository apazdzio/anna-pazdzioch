package com.kodilla.good.patterns.challenges;

public class Product {
    private final String productName;
    private final double productPrice;
    private final double quantity;

    public Product(String productName, double productPrice, double quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getQuantity() {
        return quantity;
    }
}
