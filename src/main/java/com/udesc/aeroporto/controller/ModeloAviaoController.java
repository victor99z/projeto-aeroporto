package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.ModeloAviao;
import com.udesc.aeroporto.repository.ModeloAviaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("modeloAviao", new ModeloAviao());
        model.addAttribute("modelos", modeloAviaoRepository.findAll());
        return "modelo";
    }

    @PostMapping("/modelo/cadastro")
    public String cadastro(@ModelAttribute("modeloAviao") ModeloAviao modeloAviao){
        modeloAviaoRepository.save(modeloAviao);
        return "redirect:/aviao/modelo";
    }

    @GetMapping("/modelo/delete")
    public String deleteModelo(@RequestParam(name = "codmodelo", required = true) String codmodelo){
        System.out.println(codmodelo);
        modeloAviaoRepository.deleteByCodmodelo(codmodelo);
        return "redirect:/aviao/modelo";
    }


}
