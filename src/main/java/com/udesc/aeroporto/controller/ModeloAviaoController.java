package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.formHandle.ModeloAviaoForm;
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

        model.addAttribute("modeloAviaoForm", new ModeloAviaoForm());
        model.addAttribute("modelos", modeloAviaoRepository.findAll());
        return "modelo";
    }

    @PostMapping("/modelo/cadastro")
    public String cadastro(@ModelAttribute("modeloAviaoForm") ModeloAviaoForm modeloAviaoForm){
        System.out.println(modeloAviaoForm.toString());
        return "modelo";
    }

    @GetMapping("/modelo/delete")
    public String deleteModelo(@RequestParam(name = "codmodelo", required = true) Integer codmodelo){
        modeloAviaoRepository.deleteById(codmodelo);
        return "redirect:/aviao/modelo";
    }


}
