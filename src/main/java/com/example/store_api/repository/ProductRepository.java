package com.example.store_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from products where name = :name", nativeQuery = true)
    Optional<Product> findByName(String name);

    @Query(value = "select * from products where lower(name) like lower(concat('%', :name, '%'))", nativeQuery = true)
    List<Product> findByNameContainingIgnoreCase(String name);

}