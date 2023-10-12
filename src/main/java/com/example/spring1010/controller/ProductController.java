package com.example.spring1010.controller;


import com.example.spring1010.ProductServiceImpl;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

@RestController
@RequestMapping("product")
public class ProductController {

    @ExceptionHandler({HttpSessionRequiredException.class})
    public String handleException(HttpStatusCodeException e) {
        return "Code: " + e.getStatusCode() + "Error: " + e.getMessage();
    }

    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping("/hello")
    public  String hello () {
        return "hello";
    }
}
