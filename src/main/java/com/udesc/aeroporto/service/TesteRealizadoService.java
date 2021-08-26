package com.udesc.aeroporto.service;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.TesteRealizado;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TesteRealizadoRepository;
import com.udesc.aeroporto.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TesteRealizadoService {
    private TesteRealizadoRepository testeRealizadoRepository;
    private TesteRepository testeRepository;
    private AviaoRepository aviaoRepository;

    @Autowired
    public TesteRealizadoService(TesteRealizadoRepository testeRealizadoRepository, TesteRepository testeRepository, AviaoRepository aviaoRepository) {
        this.testeRealizadoRepository = testeRealizadoRepository;
        this.testeRepository = testeRepository;
        this.aviaoRepository = aviaoRepository;
    }

    public List<TesteRealizado> getAll(){
        return this.testeRealizadoRepository.findAll();
    }

    public String cria(TesteRealizado testeRealizado){

        var teste = testeRepository.findById(testeRealizado.getTeste().getId()).orElseThrow(() -> new IllegalArgumentException("ID NÃO ENCONTRADO"));

        List<Aviao> array_aviao = new ArrayList<>();
        testeRealizado.getTeste().getAvioes().forEach(aviao -> {
            array_aviao.add(
                    aviaoRepository.findById(aviao.getId()).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"))
            );
        });

        teste.setAvioes(array_aviao);

        testeRealizado.setTeste(teste);

        return this.testeRealizadoRepository.save(testeRealizado).getId();
    }

    public void deleteById(String id){
        this.testeRealizadoRepository.deleteById(id);
    }


}
