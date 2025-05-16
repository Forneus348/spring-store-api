package com.example.store_api.repository;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String name;
    private Double price;
    private String description;
    private LocalDate orderDateTime;
}
