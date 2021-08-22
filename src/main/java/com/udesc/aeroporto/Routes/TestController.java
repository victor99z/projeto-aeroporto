package com.udesc.aeroporto.Routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/ola")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("FODASEEE");
        return String.format("test o %s!", name);
    }
}
