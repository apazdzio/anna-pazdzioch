package com.kodilla.good.patterns.gastronomy;

import com.kodilla.good.patterns.challenges.Product;

public class VegetablesContractor implements Contractor {

    private String name;

    public VegetablesContractor(String name) {
        this.name = name;
    }

    @Override
    public boolean process(Product product) {
        System.out.println("Vegetable order was received.");
        return true;
    }
}
