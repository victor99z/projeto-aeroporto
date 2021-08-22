package com.udesc.aeroporto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AeroportoController {
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "home";
    }

    @GetMapping("/aeroporto")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("FODASEEE");
        return "Home";
    }
}
