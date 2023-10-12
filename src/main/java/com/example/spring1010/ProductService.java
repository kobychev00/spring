package com.example.spring1010;

import com.example.spring1010.domain.Product;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ProductService {

    Product add(String name,
                double price,
                String code,
                Set<Integer> group);

    String getProductbyGroup(Set<Integer> group);

    String getProductbyCode(String code);


}
