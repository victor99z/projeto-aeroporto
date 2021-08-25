package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
