package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new OrderProcessor(), new MailService(), new ProductOrderRepository());

        productOrderService.process(orderRequest);
    }
}
