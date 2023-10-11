package com.example.spring1010;

import com.example.spring1010.domain.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductServiceImpl implements ProductService {
    Map<String, Product> products = new HashMap<>(Map.of(
            "grapes",
            new Product(
                    "Grapes", 295.0, "101",Set.of(1)),
            "milkies",
            new Product("Milkies", 50.0,"Л1"of(2)),
            "apples",
            new Product("Apples", 89.0, Set.of(1)),
            "juice",
            new Product("Juice", 52, Set.of(2))
    )
    );

    Map<String, Integer> proffesion = Map.of(
            "snack", 1,
            "drink", 2);


    @Override
    public List<Product> getProductbyNumber(Set<Integer> productNumber) {

        return null;
    }

    @Override
    public void addProduct(Product product) {

    }
}
