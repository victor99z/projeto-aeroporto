package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Teste;
import com.udesc.aeroporto.service.AviaoService;
import com.udesc.aeroporto.service.TesteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TesteController {

    private TesteService testeService;
    private AviaoService aviaoService;

    public TesteController(TesteService testeService, AviaoService aviaoService) {
        this.testeService = testeService;
        this.aviaoService = aviaoService;
    }

    @GetMapping("/teste")
    public String teste(Model model){

        model.addAttribute("testes", testeService.getAll());
        model.addAttribute("avioes2", aviaoService.findAll());
        model.addAttribute("teste", new Teste());

        return "teste";
    }

    @PostMapping("/teste/cadastro")
    public String cadastro(@ModelAttribute("teste") Teste teste){
        testeService.cria(teste);
        return "redirect:/teste";
    }

    @GetMapping("/teste/delete")
    public String delete(@RequestParam("id") String id){
        testeService.deleteById(id);
        return "redirect:/teste";
    }

}
