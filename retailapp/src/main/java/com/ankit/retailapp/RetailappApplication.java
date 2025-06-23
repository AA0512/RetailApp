package com.ankit.retailapp;

import com.ankit.retailapp.model.Product;
import com.ankit.retailapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RetailappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailappApplication.class, args);
		System.out.println("Hello.....");
	}
//	@Bean
//	public CommandLineRunner demo(ProductRepository productRepository) {
//		return args -> {
//			// Save a new product
//			Product p = new Product("Test Product", 199.99, "Sample description");
//			productRepository.save(p);
//
//			// Fetch all products and print
//			System.out.println("All products:");
//			productRepository.findAll().forEach(prod -> {
//				System.out.println(prod.getId() + " | " + prod.getName() + " | " + prod.getPrice());
//			});
//		};
//	}

}
