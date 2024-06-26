package com.example.demo.service;

import com.example.demo.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepositoryA productRepositoryA;

    public ProductService() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name){
        productRepositoryA.save(name);
    }

    public void remove(String name){
        productRepositoryA.remove(name);
    }
}
