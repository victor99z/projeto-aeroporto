package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Modelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ModeloRepository extends MongoRepository<Modelo, String> {
}
