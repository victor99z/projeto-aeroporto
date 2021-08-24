package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Tecnico;
import com.udesc.aeroporto.model.TesteRealizado;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TecnicoReposity;
import com.udesc.aeroporto.repository.TesteRealizadoRepository;
import com.udesc.aeroporto.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TesteRealizadoController {

    private TesteRepository testeRepository;
    private TecnicoReposity tecnicoReposity;
    private TesteRealizadoRepository testeRealizadoRepository;

    @Autowired
    public TesteRealizadoController(TesteRepository testeRepository, TecnicoReposity tecnicoReposity, TesteRealizadoRepository testeRealizadoRepository) {
        this.testeRepository = testeRepository;
        this.tecnicoReposity = tecnicoReposity;
        this.testeRealizadoRepository = testeRealizadoRepository;
    }

    @GetMapping("/teste/realizados")
    public String realizados(Model model){
        model.addAttribute("tecnicos", tecnicoReposity.findAll());
        model.addAttribute("testes", testeRepository.findAll());
        model.addAttribute("testesrealizados", testeRealizadoRepository.findAll());
        model.addAttribute("testesrealizado", new TesteRealizado());

        return "teste_realizado";
    }

    @GetMapping("/teste/realizados/delete")
    public String delete(@RequestParam(name = "idtesterealizado", required = true) Integer idtesterealizado){
        testeRealizadoRepository.deleteById(idtesterealizado);
        return "redirect:/teste/teste_realizado";
    }

    @PostMapping("/teste/realizados/cadastro")
    public String cadastrar(@ModelAttribute("testerealizado") TesteRealizado testeRealizado){
        testeRealizadoRepository.save(testeRealizado);
        return "redirect:/teste/teste_realizado";
    }

}
