package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TesteRepository extends JpaRepository<Teste, Integer> {
}
