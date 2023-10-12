package com.example.spring1010.domain;

import java.util.Set;

public class Coffee extends Product {
    public double volume;
    public Coffee(String name, double price, String code, double volume, Set<Integer> group) {
        super(name, price, code, group);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
