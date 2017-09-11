package com.kodilla.good.patterns.gastronomy;

import com.kodilla.good.patterns.challenges.Product;

public class Main {

    public static void main(String[] args) {
        FruitsContractor fruitsContractor = new FruitsContractor("ExtraFoodShop");
        Product fruit = new Product("Fruit", 20.0, 10.0);
        OrderService orderService = new OrderService(fruitsContractor, fruit);
        boolean isOrdered = orderService.order();
        if (isOrdered){
            System.out.println("Order accepted.");
        }else{
            System.out.println("Order not accepted.");
        }
    }
}
