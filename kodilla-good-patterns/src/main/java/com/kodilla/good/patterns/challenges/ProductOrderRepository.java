package com.kodilla.good.patterns.challenges;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(final OrderRequest orderRequest) {
        System.out.println("Order accepted and saved in the database");
        orderRequest.getUser().getProductList().add(orderRequest.getProduct());
    }
}
