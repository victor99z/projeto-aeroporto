package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.Modelo;
import com.udesc.aeroporto.service.AviaoService;
import com.udesc.aeroporto.service.ModeloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
public class debugController {
    AviaoService aviaoService;
    ModeloService modeloService;

    public debugController(AviaoService aviaoService, ModeloService modeloService) {
        this.aviaoService = aviaoService;
        this.modeloService = modeloService;
    }

    @GetMapping("v1/aviao")
    public List<Aviao> getAllaviao(){
        return aviaoService.findAll();
    }

    @GetMapping("v1/modelos")
    public List<Modelo> getAllmodelo(){
        return modeloService.findAll();
    }

}
