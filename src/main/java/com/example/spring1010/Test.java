package com.example.spring1010;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Product espresso = new Product("espresso", 2.99, Collections.singleton(101));
    }

    Map<String, Integer> group = Map.of(
            "кофе",0,
            "булочки",1);
}
