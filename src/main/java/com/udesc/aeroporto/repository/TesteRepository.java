package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Teste;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends MongoRepository<Teste, String> {
}
