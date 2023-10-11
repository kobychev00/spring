package com.example.spring1010.domain;

import java.util.Set;

public class Product {
    private String name;
    private double price;

    private String code;
    private Set<Integer> productNumber;

    public Product(String name, double price, String code, Set<Integer> productNumber) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.productNumber = productNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Set<Integer> getProductNumber() {
        return productNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void changePrice(double price) {
            this.price = price;
        }
    }
