package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Integer> {
}
