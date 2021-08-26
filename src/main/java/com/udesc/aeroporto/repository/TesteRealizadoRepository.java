package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.TesteRealizado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRealizadoRepository extends MongoRepository<TesteRealizado, String> {
}
