package com.udesc.aeroporto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AeroportoController {
    @GetMapping("/aeroporto")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "redirect:/";
    }

    @GetMapping("/")
    public String root()
    {
        return "foda";
    }

}
