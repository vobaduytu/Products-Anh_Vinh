package com.example.java_web;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "IP", "123456"));
        productMap.put(2, new Product(2, "Bill", "4566"));
        productMap.put(3, new Product(3, "Alex", "123664"));
        productMap.put(4, new Product(4, "Adam", "14566"));
        productMap.put(5, new Product(5, "Sophia", "46697"));
        productMap.put(6, new Product(6, "Rose", "123456"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}