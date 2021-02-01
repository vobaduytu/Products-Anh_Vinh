package com.example.java_web;

public class Product {
    private int id;
    private String name;
    private String prime;


    public Product() {
    }

    public Product(int id, String name, String prime) {
        this.id = id;
        this.name = name;
        this.prime = prime;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

}

