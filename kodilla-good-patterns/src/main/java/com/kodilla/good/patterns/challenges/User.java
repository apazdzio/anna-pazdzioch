package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class User {
        private final String realName;
        private final String userName;
        private final String eMail;
        private final List<Product> productList = new ArrayList<>();

    public User(String realName, String userName, String eMail) {
        this.realName = realName;
        this.userName = userName;
        this.eMail = eMail;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPeselId() {
        return eMail;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
}
