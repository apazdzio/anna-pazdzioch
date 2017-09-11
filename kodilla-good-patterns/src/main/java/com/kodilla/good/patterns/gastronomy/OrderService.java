package com.kodilla.good.patterns.gastronomy;

import com.kodilla.good.patterns.challenges.Product;

public class OrderService {
    private Contractor contractor;
    private Product product;

    public OrderService(Contractor contractor, Product product) {
        this.contractor = contractor;
        this.product = product;
    }

    public boolean order(){
       return contractor.process(product);
    }
}