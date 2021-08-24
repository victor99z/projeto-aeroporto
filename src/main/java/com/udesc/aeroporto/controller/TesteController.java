package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Teste;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TesteController {
    private TesteRepository testeRepository;
    private AviaoRepository aviaoRepository;

    @Autowired
    public TesteController(TesteRepository testeRepository, AviaoRepository aviaoRepository) {
        this.testeRepository = testeRepository;
        this.aviaoRepository = aviaoRepository;
    }

    @GetMapping("/teste")
    public String home(Model model){
        model.addAttribute("teste", new Teste());
        model.addAttribute("testes", testeRepository.findAll());
        model.addAttribute("avioes", aviaoRepository.findAll());
        return "teste";
    }

    @PostMapping("/teste/cadastro")
    public String add(@ModelAttribute("teste") Teste teste){
        System.out.println(teste);
        testeRepository.save(teste);
        return "redirect:/teste";
    }

    @GetMapping("/teste/delete")
    public String delete(@RequestParam(name = "nroa", required = true) Integer nroa){
        testeRepository.deleteById(nroa);
        return "redirect:/teste";
    }

}
