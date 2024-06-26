package com.example.demo.config;

import com.example.demo.repository.ProductRepositoryA;
import com.example.demo.repository.ProductRepositoryB;
import com.example.demo.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInjector {

    @Bean
    public ProductRepositoryA createProductpositoryA(){
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createProductpositoryB(){
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }

}
