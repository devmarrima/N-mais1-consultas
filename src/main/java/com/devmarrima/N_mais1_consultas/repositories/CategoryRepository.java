package com.devmarrima.N_mais1_consultas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarrima.N_mais1_consultas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
