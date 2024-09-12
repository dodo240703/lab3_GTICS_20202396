package com.example.lab3_20202396.Models.Repositories;

import com.example.lab3_20202396.Models.Entities.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository extends JpaRepository<Receta, Integer> {
}
