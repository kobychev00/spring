package com.example.spring1010.domain;

import com.example.spring1010.domain.Product;

import java.util.Set;

public class Snack extends Product {

    private double weight;

    public Snack(String name, double price, String code, double weight,Set <Integer> group) {
        super(name, price, code, group);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
