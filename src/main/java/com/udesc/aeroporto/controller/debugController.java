package com.udesc.aeroporto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class debugController {

    @GetMapping("/debug")
    public String retorna(){
        return "teste";
    }
}
