package com.udesc.aeroporto.service;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.Teste;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TesteService {
    private TesteRepository testeRepository;
    private AviaoRepository aviaoRepository;

    @Autowired
    public TesteService(TesteRepository testeRepository, AviaoRepository aviaoRepository) {
        this.testeRepository = testeRepository;
        this.aviaoRepository = aviaoRepository;
    }

    public List<Teste> getAll(){
        return this.testeRepository.findAll();
    }

    public Teste getOne(String id){
        return this.testeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID não existe"));
    }

    public Teste cria(Teste teste){
        List<Aviao> array_aviao = new ArrayList<>();
        teste.getAvioes().forEach(aviao -> {
            array_aviao.add(
                    aviaoRepository.findById(aviao.getId()).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"))
            );
        });
        teste.setAvioes(array_aviao);
        testeRepository.save(teste);

        return teste;
    }

    public void deleteById(String id){
        this.testeRepository.deleteById(id);
    }

}
