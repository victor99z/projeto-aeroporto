package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Aviao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AviaoRepository extends MongoRepository<Aviao, String> {
}
