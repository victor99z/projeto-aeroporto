package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Controlador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControladorRepository extends MongoRepository<Controlador, String> {
}
