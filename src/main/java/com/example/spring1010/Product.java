package com.example.spring1010;

import java.util.Set;

public class Product {
    private String name;
    private double price;
    private Set<Integer> productNumber;

    public Product(String name, double price, Set<Integer> productNumber) {
        this.name = name;
        this.price = price;
        this.productNumber = productNumber;
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
