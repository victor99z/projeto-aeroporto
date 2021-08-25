package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.Modelo;
import com.udesc.aeroporto.model.Tecnico;
import com.udesc.aeroporto.service.AviaoService;
import com.udesc.aeroporto.service.ModeloService;
import com.udesc.aeroporto.service.TecnicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping("/debug")
public class debugController {
    AviaoService aviaoService;
    ModeloService modeloService;
    TecnicoService tecnicoService;

    public debugController(AviaoService aviaoService, ModeloService modeloService, TecnicoService tecnicoService) {
        this.aviaoService = aviaoService;
        this.modeloService = modeloService;
        this.tecnicoService = tecnicoService;
    }

    @GetMapping("/aviao")
    public List<Aviao> getAllaviao(){
        return aviaoService.findAll();
    }

    @GetMapping("/modelos")
    public List<Modelo> getAllmodelo(){
        return modeloService.findAll();
    }

    @GetMapping("/tecnico")
    public List<Tecnico> getAll(){
        return tecnicoService.findAll();
    }

    @GetMapping("/tecnico/cadastro")
    public String insert(){
        var local = new Tecnico()
                .setMatricula(1223)
                .setEndereco("Palmeiras")
                .setNome("BIG JOE")
                .setSalario(new BigDecimal("155959.36"))
                .setTelefone("198845848")
                .setAvioes(
                        Arrays.asList(
                                new Aviao().setId("61265edf5d06341a7955bf30"),
                                new Aviao().setId("61265ee25d06341a7955bf31"))
                );

        return tecnicoService.cria(local).getId();
    }

}
