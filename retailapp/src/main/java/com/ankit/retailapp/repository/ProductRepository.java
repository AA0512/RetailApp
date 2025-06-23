package com.ankit.retailapp.repository;

import com.ankit.retailapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // ✅ No need to write any methods for basic CRUD
}
