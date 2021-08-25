package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.service.AviaoService;
import com.udesc.aeroporto.service.ModeloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AviaoController {
    private AviaoService aviaoService;
    private ModeloService modeloService;

    public AviaoController(AviaoService aviaoService, ModeloService modeloService) {
        this.aviaoService = aviaoService;
        this.modeloService = modeloService;
    }

    @GetMapping("/")
    public String redirect(){
        return "redirect:/aviao";
    }

    @GetMapping("/aviao")
    public String getAll(Model model){
        model.addAttribute("avioes",this.aviaoService.findAll());
        model.addAttribute("modelos", this.modeloService.findAll());
        model.addAttribute("aviao", new Aviao());

        return "aviao";
    }

    @PostMapping("/aviao/cadastro")
    public String insert(@ModelAttribute("aviao") Aviao aviao){
        aviaoService.cria(aviao);
        return "redirect:/aviao";
    }

    @GetMapping("/aviao/delete")
    public String delete(@RequestParam(name = "id") String id){
        aviaoService.delete(id);
        return "redirect:/aviao";
    }
}
