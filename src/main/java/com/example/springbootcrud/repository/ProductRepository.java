package com.example.springbootcrud.repository;

import com.example.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Custom query methods can be added here
    Product findByName(String name);
}