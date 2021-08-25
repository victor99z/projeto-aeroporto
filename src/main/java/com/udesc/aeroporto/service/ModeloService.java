package com.udesc.aeroporto.service;

import com.udesc.aeroporto.model.Modelo;
import com.udesc.aeroporto.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    private final ModeloRepository modeloRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public Modelo findById(String id){
        return this.modeloRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID não encontrado"));
    }

    public List<Modelo> findAll(){
        return this.modeloRepository.findAll();
    }

    public Modelo cria(Modelo modelo){
        return this.modeloRepository.save(modelo);
    }

    public void delete(String id){
        this.modeloRepository.deleteById(id);
    }

}
