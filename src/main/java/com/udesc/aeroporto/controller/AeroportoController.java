package com.udesc.aeroporto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AeroportoController {
    @GetMapping("/")
    public String root(){
        return "redirect:/aviao/modelo";
    }

}
