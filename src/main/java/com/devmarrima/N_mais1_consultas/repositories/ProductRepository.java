package com.devmarrima.N_mais1_consultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devmarrima.N_mais1_consultas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products")
    List<Product> ProductWithCategories(List<Product> products);
}
