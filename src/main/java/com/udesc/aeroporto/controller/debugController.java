package com.udesc.aeroporto.controller;

import com.udesc.aeroporto.model.Funcionario;
import com.udesc.aeroporto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;


@RestController
public class debugController {

    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public debugController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/debug/")
    public String cadadastra(){
        return funcionarioRepository.save(new Funcionario().setIdade(35).setSalario(new BigDecimal(35010000)).setNome("Joelson")).getCodigo();
    }

    @GetMapping("/debug")
    public List<Funcionario> retorna(){
        return funcionarioRepository.findAll();
    }
}
