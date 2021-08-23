package com.udesc.aeroporto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class EmpregadoController {
    @GetMapping("/empregado")
    public String fechou(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("appName", name);
        return "index";
    }
}
