package com.example.lab3_20202396.Controllers;

import com.example.lab3_20202396.Models.Entities.Categoria;
import com.example.lab3_20202396.Models.Entities.Receta;
import com.example.lab3_20202396.Models.Repositories.CategoriaRepository;
import com.example.lab3_20202396.Models.Repositories.RecetaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recetas")
public class RecetasController {

    final RecetaRepository recetaRepository;
    final CategoriaRepository categoriaRepository;

    public RecetasController(RecetaRepository recetaRepository, CategoriaRepository categoriaRepository) {
        this.recetaRepository = recetaRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/listar")
    public String listarRecetas(Model model) {
        List<Receta> listaRecetas = recetaRepository.findAll();
        model.addAttribute("listaRecetas", listaRecetas);
        return"listaRecetas";
    }
    @GetMapping("/formCrear")
    public String crearReceta(Model model) {
        List<Categoria> listaCategorias = categoriaRepository.findAll();
        model.addAttribute("listaCategorias", listaCategorias);
        return "crearRecetas";
    }

    @PostMapping("/crearReceta")
    public String crearReceta(Receta receta) {
        System.out.println(receta.getTiempoPreparacion());
        recetaRepository.save(receta);

        return "redirect:/recetas/listar";
    }
}
