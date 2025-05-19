package com.example.store_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from products where name = :name", nativeQuery = true)
    Optional<Product> findByName(String name);
}