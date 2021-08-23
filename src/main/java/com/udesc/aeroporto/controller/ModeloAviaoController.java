package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.ModeloAviao;
import com.udesc.aeroporto.repository.ModeloAviaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/aviao")
public class ModeloAviaoController {
    private ModeloAviaoRepository modeloAviaoRepository;

    @Autowired
    public ModeloAviaoController(ModeloAviaoRepository modeloAviaoRepository) {
        this.modeloAviaoRepository = modeloAviaoRepository;
    }

    @GetMapping("/modelo")
    public String getAll(Model model){
        model.addAttribute("modelos", modeloAviaoRepository.findAll());
        return "modeloListagem";
    }

    @GetMapping("/modelo/cadastro")
    public String insert(@ModelAttribute("ModeloAviao") ModeloAviao modeloAviao){
        return "/modelo";
    }

}
