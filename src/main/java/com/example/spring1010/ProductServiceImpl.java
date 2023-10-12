package com.example.spring1010;

import com.example.spring1010.domain.Coffee;
import com.example.spring1010.domain.Product;
import com.example.spring1010.domain.Snack;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Service

public class ProductServiceImpl implements ProductService {

   private final Map<String, Product> products = new LinkedHashMap<>(Map.of(
            "grapes",
            new Snack(
                    "Grapes", 295.0, "101", 1.00, Set.of(1)),
            "espresso",
            new Coffee("Espresso", 90.0,"201", 0.2, Set.of(2)),
            "apples",
            new Snack("Apples", 89.0, "102", 1.0, Set.of(1)),
            "juice",
            new Coffee("Juice", 52, "202", 0.25, Set.of(2))
    )
    );

    private static final int MAX_SIZE = 5;

    Map<String, Integer> groups = Map.of(
            "snack", 1,
            "drink", 2);


    @Override
    public Product add(String name, double price, String code, Set<Integer> group) {
        return null;
    }

    @Override
    public String getProductbyGroup(Set<Integer> group) {
        final Product product = products.get(group);
        if (product == null) {
            throw new RuntimeException("Продукт не найден");
        }
        final String productDescription = " "
                + product.getName() + ", "
                + product.getPrice() + ", "
                + product.getCode() + ", "
                + getProductbyGroup(product.getGroup());
        return productDescription;
        }


    @Override
    public String getProductbyCode(String code) {
        return null;
    }
}
