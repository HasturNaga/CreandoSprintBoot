package com.example.demo;

import com.example.demo.repository.ProductRepositoryA;
import com.example.demo.repository.ProductRepositoryB;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimerProyectoApplication {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoApplication.class, args);
	}


	@Bean
	public CommandLineRunner comandoUtilizandoAutowired() {
		return (args) -> {

			productService.save("Tecladop RGB");
			productService.remove("Auriculares");

		};
	}
}
