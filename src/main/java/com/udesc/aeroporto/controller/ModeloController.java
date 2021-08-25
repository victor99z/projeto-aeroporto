package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Modelo;
import com.udesc.aeroporto.service.ModeloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ModeloController {

    ModeloService modeloService;

    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @GetMapping("/modelo")
    public String getAll(Model model){
        model.addAttribute("modelos",this.modeloService.findAll());
        model.addAttribute("modelo", new Modelo());

        return "modelo";
    }

    @PostMapping("/modelo/cadastro")
    public String insert(@ModelAttribute("modelo") Modelo modelo){
        modeloService.cria(modelo);
        return "redirect:/modelo";
    }

    @GetMapping("/modelo/delete")
    public String delete(
            @RequestParam(name = "id")
            String id
            ){

        modeloService.delete(id);
        return "redirect:/modelo";
    }

}
