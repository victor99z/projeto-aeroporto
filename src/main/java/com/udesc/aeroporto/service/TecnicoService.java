package com.udesc.aeroporto.service;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.model.Tecnico;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.TecnicoRepository;
import com.udesc.aeroporto.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TecnicoService {
    TecnicoRepository tecnicoRepository;
    AviaoRepository aviaoRepository;

    @Autowired
    public TecnicoService(TecnicoRepository tecnicoRepository, AviaoRepository aviaoRepository) {
        this.tecnicoRepository = tecnicoRepository;
        this.aviaoRepository = aviaoRepository;
    }

    public Tecnico findById(String id){
        return this.tecnicoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"));
    }

    public List<Tecnico> findAll(){
        return this.tecnicoRepository.findAll();
    }

    public Tecnico cria(Tecnico tecnico){

        List<Aviao> array_aviao = new ArrayList<>();
        tecnico.getAvioes().forEach(aviao -> {
                array_aviao.add(
                        aviaoRepository.findById(aviao.getId()).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"))
                );
        });
        tecnico.setAvioes(array_aviao);
        tecnicoRepository.save(tecnico);
        return tecnico;
    }

    public void deleteById(String id){
        this.tecnicoRepository.deleteById(id);
    }

}
