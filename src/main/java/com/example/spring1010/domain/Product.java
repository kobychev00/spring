package com.example.spring1010.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private double price;

    private String code;
    private Set<Integer> group;

    public Product(String name, double price, String code, Set<Integer> group) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.group = new HashSet<>(group);

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

    public Set<Integer> getGroup() {
        return group;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void changePrice(double price) {
            this.price = price;
        }
    }


