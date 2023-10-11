package com.example.spring1010.domain;

import java.util.Set;

public class Coffee extends Product {
    public String volume;
    public Coffee(String name, String group, double price, String volume, Set<Integer> productNumber) {
        super(name, price, productNumber);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
