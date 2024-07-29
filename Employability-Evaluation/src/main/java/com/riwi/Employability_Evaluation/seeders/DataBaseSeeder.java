package com.riwi.Employability_Evaluation.seeders;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.riwi.Employability_Evaluation.domain.entities.Product;
import com.riwi.Employability_Evaluation.domain.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DataBaseSeeder implements CommandLineRunner {
    @Autowired
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if(this.productRepository.count() > 0 ) return;
        Product product1 = Product.builder().name("Pencil").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product2 = Product.builder().name("Pencil Case").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product3 = Product.builder().name("Notebook").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product4 = Product.builder().name("Book").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product5 = Product.builder().name("Bag").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product6 = Product.builder().name("Eraser").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product7 = Product.builder().name("Diary").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product8 = Product.builder().name("Shirt").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product9 = Product.builder().name("Coat").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();
        Product product10 = Product.builder().name("Cap").price(BigDecimal.valueOf(1234.12)).id(UUID.randomUUID().toString()).build();

        this.productRepository.save(product1);
        this.productRepository.save(product2);
        this.productRepository.save(product3);
        this.productRepository.save(product4);
        this.productRepository.save(product5);
        this.productRepository.save(product6);
        this.productRepository.save(product7);
        this.productRepository.save(product8);
        this.productRepository.save(product9);
        this.productRepository.save(product10);
    }
}
