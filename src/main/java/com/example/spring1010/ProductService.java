package com.example.spring1010;

import com.example.spring1010.domain.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {

    List<Product> getProductbyCode(String code);

    void addProduct(Product product);

}
