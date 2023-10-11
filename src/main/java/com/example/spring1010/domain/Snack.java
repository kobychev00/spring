package com.example.spring1010.domain;

import com.example.spring1010.domain.Product;

import java.util.Set;

public class Snack extends Product {

    private double weight;

    public Snack(String name, double price, double weight,Set <Integer> productNumber) {
        super(name, price, productNumber);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
