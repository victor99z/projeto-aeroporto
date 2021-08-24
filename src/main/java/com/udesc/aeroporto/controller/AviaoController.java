package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.ModeloAviaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AviaoController {

    private AviaoRepository aviaoRepository;
    private ModeloAviaoRepository modeloAviaoRepository;

    @Autowired
    public AviaoController(AviaoRepository aviaoRepository, ModeloAviaoRepository modeloAviaoRepository) {
        this.aviaoRepository = aviaoRepository;
        this.modeloAviaoRepository = modeloAviaoRepository;
    }


    @GetMapping("/aviao")
    public String pagina(Model model){
        model.addAttribute("aviao", new Aviao());
        model.addAttribute("avioes", aviaoRepository.findAll());
        model.addAttribute("modelos", modeloAviaoRepository.findAll());
        return "aviao";
    }

    @PostMapping("/aviao/cadastro")
    public String cadastroAviao(@ModelAttribute("aviao") Aviao aviao){
        aviaoRepository.save(aviao);
        return "redirect:/aviao";
    }

    @GetMapping("/aviao/delete")
    public String pagina(@RequestParam(name = "num_registro") Integer num_registro){
        aviaoRepository.deleteById(num_registro);
        return "redirect:/aviao";
    }
}
