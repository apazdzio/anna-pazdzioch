package com.kodilla.good.patterns.gastronomy;

import com.kodilla.good.patterns.challenges.Product;
import com.sun.org.apache.xpath.internal.SourceTree;

public class FruitsContractor implements Contractor {

    private String name;

    public FruitsContractor(String name) {
        this.name = name;
    }

    @Override
    public boolean process(Product product) {
        System.out.println("Fruit order was received.");
        return true;
    }
}
