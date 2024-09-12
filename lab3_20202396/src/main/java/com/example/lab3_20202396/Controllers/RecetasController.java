package com.example.lab3_20202396.Controllers;

import com.example.lab3_20202396.Models.Entities.Receta;
import com.example.lab3_20202396.Models.Repositories.RecetaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recetas")
public class RecetasController {

    final RecetaRepository recetaRepository;

    public RecetasController(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    @GetMapping("/listar")
    public String listarRecetas(Model model) {
        List<Receta> listaRecetas = recetaRepository.findAll();
        model.addAttribute("listaRecetas", listaRecetas);
        return"listarRecetas";
    }
}
