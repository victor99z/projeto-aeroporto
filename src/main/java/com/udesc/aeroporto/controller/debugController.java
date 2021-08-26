package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.*;
import com.udesc.aeroporto.service.*;
import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController()
@RequestMapping("/debug")
public class debugController {
    AviaoService aviaoService;
    ModeloService modeloService;
    TecnicoService tecnicoService;
    TesteService testeService;
    TesteRealizadoService testeRealizadoService;

    public debugController(AviaoService aviaoService, ModeloService modeloService, TecnicoService tecnicoService, TesteService testeService, TesteRealizadoService testeRealizadoService) {
        this.aviaoService = aviaoService;
        this.modeloService = modeloService;
        this.tecnicoService = tecnicoService;
        this.testeService = testeService;
        this.testeRealizadoService = testeRealizadoService;
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

    @GetMapping("/teste")
    public List<Teste> getTeste(){
        return this.testeService.getAll();
    }

    @GetMapping("/teste/cadastro")
    public String cadastraTeste(){
        var temp = new Teste()
                .setNome("TESTE 1")
                .setPontuacao_max(500.00)
                .setAvioes(Arrays.asList(
                        new Aviao().setId("61265edf5d06341a7955bf30"),
                        new Aviao().setId("61265ee25d06341a7955bf31")));

        var local = this.testeService.cria(temp);

        return local.getId();
    }

    @GetMapping("/teste/realizado")
    public List<TesteRealizado> getTesteRealizado(){
        return this.testeRealizadoService.getAll();
    }

    @GetMapping("/teste/realizado/cadastro")
    public String getTesteRealizadoCad() throws ParseException {



        String myDateString = "13:24:40";
        String myDateString2 = "06/22/2021";

        return this.testeRealizadoService.cria(
                new TesteRealizado()
                        .setPontuacao_obtida(365.6)
                        .setHoras_gastas(myDateString)
                        .setEmpregado(new Empregado()
                                .setId("6126d2466067c53f65182848")
                                )
                        .setTeste(
                                new Teste()
                                    .setId("6126fc109cc5332052170c05")
                                    .setAvioes(Arrays.asList(
                                        new Aviao().setId("61265edf5d06341a7955bf30")))
                        )
                        .setData(myDateString2)
        );
    }

}
