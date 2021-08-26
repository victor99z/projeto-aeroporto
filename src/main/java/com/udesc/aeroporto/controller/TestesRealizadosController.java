package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.TesteRealizado;
import com.udesc.aeroporto.service.TecnicoService;
import com.udesc.aeroporto.service.TesteRealizadoService;
import com.udesc.aeroporto.service.TesteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestesRealizadosController {
    private TecnicoService tecnicoService;
    private TesteService testeService;
    private TesteRealizadoService testeRealizadoService;

    public TestesRealizadosController(TecnicoService tecnicoService, TesteService testeService, TesteRealizadoService testeRealizadoService) {
        this.tecnicoService = tecnicoService;
        this.testeService = testeService;
        this.testeRealizadoService = testeRealizadoService;
    }

    @GetMapping("/teste/realizado")
    public String teste(Model model){


        model.addAttribute("testes", testeService.getAll());
        model.addAttribute("testesrealizados", testeRealizadoService.getAll());
        model.addAttribute("tecnicos", tecnicoService.findAll());
        model.addAttribute("testeRealizado", new TesteRealizado());

        return "teste_realizado";
    }

    @PostMapping("/teste/realizado/cadastro")
    public String cadastro(@ModelAttribute("testeRealizado") TesteRealizado testeRealizado){
        testeRealizadoService.cria(testeRealizado);
        return "redirect:/teste/realizado";
    }

    @GetMapping("/teste/realizado/delete")
    public String delete(@RequestParam("id") String id){
        testeRealizadoService.deleteById(id);
        return "redirect:/teste/realizado";
    }

}
