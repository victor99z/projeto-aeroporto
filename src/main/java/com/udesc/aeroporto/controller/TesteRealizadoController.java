package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.TestesRealizados;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TecnicoReposity;
import com.udesc.aeroporto.repository.TestesRealizadosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TesteRealizadoController {

    private AviaoRepository aviaoRepository;
    private TecnicoReposity tecnicoReposity;
    private TestesRealizadosRepository testesRealizadosRepository;

    public TesteRealizadoController(AviaoRepository aviaoRepository, TecnicoReposity tecnicoReposity, TestesRealizadosRepository testesRealizadosRepository) {
        this.aviaoRepository = aviaoRepository;
        this.tecnicoReposity = tecnicoReposity;
        this.testesRealizadosRepository = testesRealizadosRepository;
    }

    @GetMapping("/teste/realizados")
    public String realizados(Model model){

        model.addAttribute("avioes", aviaoRepository.findAll());
        model.addAttribute("tecnicos", aviaoRepository.findAll());
        model.addAttribute("testesrealizado", new TestesRealizados());

        return "testes_realizados";
    }
}
