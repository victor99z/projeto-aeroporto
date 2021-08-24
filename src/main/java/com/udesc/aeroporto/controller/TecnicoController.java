package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Tecnico;
import com.udesc.aeroporto.repository.TecnicoReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TecnicoController {

    private TecnicoReposity tecnicoReposity;

    @Autowired
    public TecnicoController(TecnicoReposity tecnicoReposity) {
        this.tecnicoReposity = tecnicoReposity;
    }

    @GetMapping("/tecnico")
    public String tecnico(Model model){
        model.addAttribute("tecnico", new Tecnico());
        model.addAttribute("tecnicos", tecnicoReposity.findAll());
        return "tecnico";
    }

    @PostMapping("/tecnico/cadastro")
    public String cadastrar(@ModelAttribute("tecnico") Tecnico tecnico){
        tecnicoReposity.save(tecnico);
        return "redirect:/tecnico";
    }

    @GetMapping("/tecnico/delete")
    public String delete(@RequestParam(name = "idempregado", required = true) Integer idempregado){
        tecnicoReposity.deleteById(idempregado);
        return "redirect:/tecnico";
    }

}
