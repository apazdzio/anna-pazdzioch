package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Anna Smith", "Baby", "peter@nm.eu");
        Product product = new Product("Lipstick", 30.0, 1);

        return new OrderRequest(user, product);
    }
}
