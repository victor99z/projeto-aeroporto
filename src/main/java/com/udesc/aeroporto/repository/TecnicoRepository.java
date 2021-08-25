package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Tecnico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TecnicoRepository extends MongoRepository<Tecnico, String> {
}
