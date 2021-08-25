package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.Tecnico;
import com.udesc.aeroporto.service.AviaoService;
import com.udesc.aeroporto.service.TecnicoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TecnicoController {

    TecnicoService tecnicoService;
    AviaoService aviaoService;

    public TecnicoController(TecnicoService tecnicoService, AviaoService aviaoService) {
        this.tecnicoService = tecnicoService;
        this.aviaoService = aviaoService;
    }

    @GetMapping("/tecnico")
    public String principal(Model model){
        model.addAttribute("tecnico", new Tecnico());
        model.addAttribute("aviao", new Aviao());
        model.addAttribute("avioes2", aviaoService.findAll());
        model.addAttribute("tecnicos", tecnicoService.findAll());
        return "tecnico";
    }

    @PostMapping("/tecnico/cadastro")
    public String cadastro(@ModelAttribute("tecnico") Tecnico tecnico){
        tecnicoService.cria(tecnico);
        return "redirect:/tecnico";
    }

    @GetMapping("/tecnico/delete")
    public String principal(
            @RequestParam("id")
            String id
            ){

        tecnicoService.deleteById(id);

        return "redirect:/tecnico";
    }

}
