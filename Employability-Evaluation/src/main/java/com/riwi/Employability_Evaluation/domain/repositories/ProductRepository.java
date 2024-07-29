package com.riwi.Employability_Evaluation.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.Employability_Evaluation.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
