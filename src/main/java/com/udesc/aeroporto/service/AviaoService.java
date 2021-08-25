package com.udesc.aeroporto.service;

import com.udesc.aeroporto.model.Aviao;
import com.udesc.aeroporto.repository.AviaoRepository;
import com.udesc.aeroporto.repository.ModeloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AviaoService {
    AviaoRepository aviaoRepository;
    ModeloRepository modeloRepository;

    public AviaoService(AviaoRepository aviaoRepository, ModeloRepository modeloRepository) {
        this.aviaoRepository = aviaoRepository;
        this.modeloRepository = modeloRepository;
    }

    public Aviao findById(String id){
        return this.aviaoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"));
    }

    public List<Aviao> findAll(){
        return this.aviaoRepository.findAll();
    }

    public Aviao cria(Aviao aviao){
        var modelo = modeloRepository.findById("61263f5ffdad745d270d4934").orElseThrow(() -> new IllegalArgumentException("ID não encontrado"));
        aviao.setModelo(modelo);
        return this.aviaoRepository.save(aviao);
    }

    public void delete(String id){
        this.aviaoRepository.deleteById(id);
    }
    
}
