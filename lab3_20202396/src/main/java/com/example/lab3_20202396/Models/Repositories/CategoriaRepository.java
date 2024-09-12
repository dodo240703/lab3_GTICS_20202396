package com.example.lab3_20202396.Models.Repositories;

import com.example.lab3_20202396.Models.Entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
